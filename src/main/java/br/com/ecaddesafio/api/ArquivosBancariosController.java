package br.com.ecaddesafio.api;

import java.text.ParseException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.ecaddesafio.dto.ArquivoBancarioDTO;
import br.com.ecaddesafio.model.ArquivoBancario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@Api(value="Arquivos Bancarios")
@RequestMapping(value = "/arquivosBancarios")
@CrossOrigin(origins = "http://localhost:3000")
public interface ArquivosBancariosController {
    @GetMapping("/listar")
    @ApiOperation(value="Retorna uma lista de arquivos Bancarios")
    public List<ArquivoBancarioDTO> listar( @RequestParam("pesquisaNome") String pesquisaNome,@RequestParam("pesquisaTipo") Long pesquisaTipo,@RequestParam("pesquisaDataInicio") String pesquisaDataInicio,@RequestParam("pesquisaDataFim") String pesquisaDataFim) throws ParseException;
    
    @PostMapping("/salvar")
    @ApiOperation(value="Salva um arquivo bancario do tipo ArquivoBancario ")
    @ResponseStatus(HttpStatus.CREATED)
    public ArquivoBancario salvar( @RequestBody ArquivoBancario arquivoBancario);
    
    @PostMapping("/salvarListaArquivosBancarios")
    @ApiOperation(value="Salva um arquivo bancario do tipo ArquivoBancario ")
    @ResponseStatus(HttpStatus.CREATED)
    public  List<ArquivoBancario>  salvarListaArquivosBancarios( @RequestBody List<ArquivoBancario> arquivoBancario);

}
