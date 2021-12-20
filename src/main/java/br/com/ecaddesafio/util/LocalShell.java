package br.com.ecaddesafio.util;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class LocalShell {
        public String executeCommand(final String command) throws IOException {
                final ArrayList<String> commands = new ArrayList<String>();
                commands.add("/bin/bash");
                commands.add("-c");
                commands.add(command);
                String retorno = null;
                BufferedReader br = null;
                log.error("processando...");
                try {
                        final ProcessBuilder p = new ProcessBuilder(commands);
                        final Process process = p.start();
                        final InputStream is = process.getInputStream();
                        final InputStreamReader isr = new InputStreamReader(is);
                        br = new BufferedReader(isr);
                        String line;
                        log.error("processando try...");
                        while ((line = br.readLine()) != null) {
                            log.error("while: "+line);
                                retorno = line;
                        }
                        log.error("retorno: "+retorno);
                } catch (IOException ioe) {
                        throw ioe;
                } finally {
                        secureClose(br);
                }
                return retorno;
        }
        private void secureClose(final Closeable resource) {
                try {
                        if (resource != null) {
                                resource.close();
                        }
                } catch (IOException ex) {
                }
        }
}