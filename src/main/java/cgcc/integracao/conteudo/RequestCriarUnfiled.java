/*
 * API de Integração com GCC - Conteúdo
 * Provê funcionalidades para criação, recuperação e atualização de conteúdo no repositório GCC
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cgcc.integracao.conteudo;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import cgcc.integracao.conteudo.Metadado;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contempla as informações a serem enviadas na requisição de criação de conteúdo no repositório GCC, sem associá-lo a um dossiê
 */
@ApiModel(description = "Contempla as informações a serem enviadas na requisição de criação de conteúdo no repositório GCC, sem associá-lo a um dossiê")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-02T20:33:16.213Z")
public class RequestCriarUnfiled {
  @SerializedName("centroCusto")
  private String centroCusto = null;

  @SerializedName("canal")
  private String canal = null;

  @SerializedName("usuario")
  private String usuario = null;

  @SerializedName("senha")
  private String senha = null;

  @SerializedName("objectStore")
  private String objectStore = null;

  @SerializedName("titulo")
  private String titulo = null;

  @SerializedName("classeDocumento")
  private String classeDocumento = null;

  @SerializedName("extensao")
  private String extensao = null;

  @SerializedName("mimetype")
  private String mimetype = null;

  @SerializedName("metadados")
  private List<Metadado> metadados = new ArrayList<Metadado>();

  @SerializedName("arquivos")
  private List<String> arquivos = new ArrayList<String>();

  public RequestCriarUnfiled centroCusto(String centroCusto) {
    this.centroCusto = centroCusto;
    return this;
  }

   /**
   * Centro de custo que esta executando a requisição
   * @return centroCusto
  **/
  @ApiModelProperty(required = true, value = "Centro de custo que esta executando a requisição")
  public String getCentroCusto() {
    return centroCusto;
  }

  public void setCentroCusto(String centroCusto) {
    this.centroCusto = centroCusto;
  }

  public RequestCriarUnfiled canal(String canal) {
    this.canal = canal;
    return this;
  }

   /**
   * Canal que está executando a requisição
   * @return canal
  **/
  @ApiModelProperty(required = true, value = "Canal que está executando a requisição")
  public String getCanal() {
    return canal;
  }

  public void setCanal(String canal) {
    this.canal = canal;
  }

  public RequestCriarUnfiled usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }

   /**
   * Usuário para autenticação no repositório GCC (o usuário deve estar criptografado no padrão GCC)
   * @return usuario
  **/
  @ApiModelProperty(required = true, value = "Usuário para autenticação no repositório GCC (o usuário deve estar criptografado no padrão GCC)")
  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public RequestCriarUnfiled senha(String senha) {
    this.senha = senha;
    return this;
  }

   /**
   * Senha para autenticação no repositório GCC (a senha deve estar criptografada no padrão GCC)
   * @return senha
  **/
  @ApiModelProperty(required = true, value = "Senha para autenticação no repositório GCC (a senha deve estar criptografada no padrão GCC)")
  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public RequestCriarUnfiled objectStore(String objectStore) {
    this.objectStore = objectStore;
    return this;
  }

   /**
   * ObjectStore onde será executada a operação no repositório
   * @return objectStore
  **/
  @ApiModelProperty(example = "OS-CAMBIO", required = true, value = "ObjectStore onde será executada a operação no repositório")
  public String getObjectStore() {
    return objectStore;
  }

  public void setObjectStore(String objectStore) {
    this.objectStore = objectStore;
  }

  public RequestCriarUnfiled titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }

   /**
   * Título do conteúdo a ser armazenado. O ideal é que seja enviado um valor dinâmico, a fim de possibilitar a unicidade dos conteúdos no repositório e que ao final do titulo seja enviada a extensão
   * @return titulo
  **/
  @ApiModelProperty(example = "F123456987852401382-000-E160.jpg", required = true, value = "Título do conteúdo a ser armazenado. O ideal é que seja enviado um valor dinâmico, a fim de possibilitar a unicidade dos conteúdos no repositório e que ao final do titulo seja enviada a extensão")
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public RequestCriarUnfiled classeDocumento(String classeDocumento) {
    this.classeDocumento = classeDocumento;
    return this;
  }

   /**
   * Classe de documento a ser utilizada na criação do conteúdo
   * @return classeDocumento
  **/
  @ApiModelProperty(example = "docGccPessoaFisicaRG", required = true, value = "Classe de documento a ser utilizada na criação do conteúdo")
  public String getClasseDocumento() {
    return classeDocumento;
  }

  public void setClasseDocumento(String classeDocumento) {
    this.classeDocumento = classeDocumento;
  }

  public RequestCriarUnfiled extensao(String extensao) {
    this.extensao = extensao;
    return this;
  }

   /**
   * Extensão do conteúdo que está sendo armazenado
   * @return extensao
  **/
  @ApiModelProperty(example = ".jpg", required = true, value = "Extensão do conteúdo que está sendo armazenado")
  public String getExtensao() {
    return extensao;
  }

  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  public RequestCriarUnfiled mimetype(String mimetype) {
    this.mimetype = mimetype;
    return this;
  }

   /**
   * MimeType do conteúdo que está sendo armazenado - enviar todo em letras minúsculas
   * @return mimetype
  **/
  @ApiModelProperty(example = "image/jpeg", required = true, value = "MimeType do conteúdo que está sendo armazenado - enviar todo em letras minúsculas")
  public String getMimetype() {
    return mimetype;
  }

  public void setMimetype(String mimetype) {
    this.mimetype = mimetype;
  }

  public RequestCriarUnfiled metadados(List<Metadado> metadados) {
    this.metadados = metadados;
    return this;
  }

  public RequestCriarUnfiled addMetadadosItem(Metadado metadadosItem) {
    this.metadados.add(metadadosItem);
    return this;
  }

   /**
   * Lista de metadados a serem armazenados no conteúdo
   * @return metadados
  **/
  @ApiModelProperty(required = true, value = "Lista de metadados a serem armazenados no conteúdo")
  public List<Metadado> getMetadados() {
    return metadados;
  }

  public void setMetadados(List<Metadado> metadados) {
    this.metadados = metadados;
  }

  public RequestCriarUnfiled arquivos(List<String> arquivos) {
    this.arquivos = arquivos;
    return this;
  }

  public RequestCriarUnfiled addArquivosItem(String arquivosItem) {
    this.arquivos.add(arquivosItem);
    return this;
  }

   /**
   * Lista de arquivos, em Base64, que formam o conteúdo
   * @return arquivos
  **/
  @ApiModelProperty(required = true, value = "Lista de arquivos, em Base64, que formam o conteúdo")
  public List<String> getArquivos() {
    return arquivos;
  }

  public void setArquivos(List<String> arquivos) {
    this.arquivos = arquivos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCriarUnfiled requestCriarUnfiled = (RequestCriarUnfiled) o;
    return Objects.equals(this.centroCusto, requestCriarUnfiled.centroCusto) &&
        Objects.equals(this.canal, requestCriarUnfiled.canal) &&
        Objects.equals(this.usuario, requestCriarUnfiled.usuario) &&
        Objects.equals(this.senha, requestCriarUnfiled.senha) &&
        Objects.equals(this.objectStore, requestCriarUnfiled.objectStore) &&
        Objects.equals(this.titulo, requestCriarUnfiled.titulo) &&
        Objects.equals(this.classeDocumento, requestCriarUnfiled.classeDocumento) &&
        Objects.equals(this.extensao, requestCriarUnfiled.extensao) &&
        Objects.equals(this.mimetype, requestCriarUnfiled.mimetype) &&
        Objects.equals(this.metadados, requestCriarUnfiled.metadados) &&
        Objects.equals(this.arquivos, requestCriarUnfiled.arquivos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centroCusto, canal, usuario, senha, objectStore, titulo, classeDocumento, extensao, mimetype, metadados, arquivos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCriarUnfiled {\n");
    
    sb.append("    centroCusto: ").append(toIndentedString(centroCusto)).append("\n");
    sb.append("    canal: ").append(toIndentedString(canal)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    objectStore: ").append(toIndentedString(objectStore)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    classeDocumento: ").append(toIndentedString(classeDocumento)).append("\n");
    sb.append("    extensao: ").append(toIndentedString(extensao)).append("\n");
    sb.append("    mimetype: ").append(toIndentedString(mimetype)).append("\n");
    sb.append("    metadados: ").append(toIndentedString(metadados)).append("\n");
    sb.append("    arquivos: ").append(toIndentedString(arquivos)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

