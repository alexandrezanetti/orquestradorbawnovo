package cgcc.integracao.pastas;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contempla o conteúdo a ser enviado na requisição de associação de conteúdo já existente à uma pasta já existente no repositório GCC
 */
@ApiModel(description = "Contempla o conteúdo a ser enviado na requisição de associação de conteúdo já existente à uma pasta já existente no repositório GCC")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-05T16:43:43.593Z")
public class RequestAssociarDocumento {
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

  @SerializedName("idConteudo")
  private String idConteudo = null;

  @SerializedName("caminhoPasta")
  private String caminhoPasta = null;

  public RequestAssociarDocumento centroCusto(String centroCusto) {
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

  public RequestAssociarDocumento canal(String canal) {
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

  public RequestAssociarDocumento usuario(String usuario) {
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

  public RequestAssociarDocumento senha(String senha) {
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

  public RequestAssociarDocumento objectStore(String objectStore) {
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

  public RequestAssociarDocumento idConteudo(String idConteudo) {
    this.idConteudo = idConteudo;
    return this;
  }

   /**
   * ID do conteúdo existente no repositório
   * @return idConteudo
  **/
  @ApiModelProperty(example = "{C97BCC59-B870-4858-8BB1-0D5355984C68}", required = true, value = "ID do conteúdo existente no repositório")
  public String getIdConteudo() {
    return idConteudo;
  }

  public void setIdConteudo(String idConteudo) {
    this.idConteudo = idConteudo;
  }

  public RequestAssociarDocumento caminhoPasta(String caminhoPasta) {
    this.caminhoPasta = caminhoPasta;
    return this;
  }

   /**
   * Caminho da pasta (já existente) ao qual o conteúdo deve ser associado
   * @return caminhoPasta
  **/
  @ApiModelProperty(example = "/GCC/Abertura Conta/Processos/1382/12345", required = true, value = "Caminho da pasta (já existente) ao qual o conteúdo deve ser associado")
  public String getCaminhoPasta() {
    return caminhoPasta;
  }

  public void setCaminhoPasta(String caminhoPasta) {
    this.caminhoPasta = caminhoPasta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestAssociarDocumento requestAssociarDocumento = (RequestAssociarDocumento) o;
    return Objects.equals(this.centroCusto, requestAssociarDocumento.centroCusto) &&
        Objects.equals(this.canal, requestAssociarDocumento.canal) &&
        Objects.equals(this.usuario, requestAssociarDocumento.usuario) &&
        Objects.equals(this.senha, requestAssociarDocumento.senha) &&
        Objects.equals(this.objectStore, requestAssociarDocumento.objectStore) &&
        Objects.equals(this.idConteudo, requestAssociarDocumento.idConteudo) &&
        Objects.equals(this.caminhoPasta, requestAssociarDocumento.caminhoPasta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centroCusto, canal, usuario, senha, objectStore, idConteudo, caminhoPasta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestAssociarDocumento {\n");
    
    sb.append("    centroCusto: ").append(toIndentedString(centroCusto)).append("\n");
    sb.append("    canal: ").append(toIndentedString(canal)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    objectStore: ").append(toIndentedString(objectStore)).append("\n");
    sb.append("    idConteudo: ").append(toIndentedString(idConteudo)).append("\n");
    sb.append("    caminhoPasta: ").append(toIndentedString(caminhoPasta)).append("\n");
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

