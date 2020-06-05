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
import java.util.ArrayList;
import java.util.List;

/**
 * Contempla o conteúdo a ser enviado na requisição de pesquisa de conteúdos associados em uma estrutura de pastas
 */
@ApiModel(description = "Contempla o conteúdo a ser enviado na requisição de pesquisa de conteúdos associados em uma estrutura de pastas")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-05T16:43:43.593Z")
public class RequestPesquisar {
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

  @SerializedName("caminhoPasta")
  private String caminhoPasta = null;

  @SerializedName("metadados")
  private List<String> metadados = new ArrayList<String>();

  public RequestPesquisar centroCusto(String centroCusto) {
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

  public RequestPesquisar canal(String canal) {
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

  public RequestPesquisar usuario(String usuario) {
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

  public RequestPesquisar senha(String senha) {
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

  public RequestPesquisar objectStore(String objectStore) {
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

  public RequestPesquisar caminhoPasta(String caminhoPasta) {
    this.caminhoPasta = caminhoPasta;
    return this;
  }

   /**
   * Caminho da pasta da qual deseja-se obter os conteúdos associados
   * @return caminhoPasta
  **/
  @ApiModelProperty(example = "/GCC/Abertura Conta/Processos/1382/12345", required = true, value = "Caminho da pasta da qual deseja-se obter os conteúdos associados")
  public String getCaminhoPasta() {
    return caminhoPasta;
  }

  public void setCaminhoPasta(String caminhoPasta) {
    this.caminhoPasta = caminhoPasta;
  }

  public RequestPesquisar metadados(List<String> metadados) {
    this.metadados = metadados;
    return this;
  }

  public RequestPesquisar addMetadadosItem(String metadadosItem) {
    this.metadados.add(metadadosItem);
    return this;
  }

   /**
   * Metadados que devem ser retornados para cada conteúdo
   * @return metadados
  **/
  @ApiModelProperty(required = true, value = "Metadados que devem ser retornados para cada conteúdo")
  public List<String> getMetadados() {
    return metadados;
  }

  public void setMetadados(List<String> metadados) {
    this.metadados = metadados;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPesquisar requestPesquisar = (RequestPesquisar) o;
    return Objects.equals(this.centroCusto, requestPesquisar.centroCusto) &&
        Objects.equals(this.canal, requestPesquisar.canal) &&
        Objects.equals(this.usuario, requestPesquisar.usuario) &&
        Objects.equals(this.senha, requestPesquisar.senha) &&
        Objects.equals(this.objectStore, requestPesquisar.objectStore) &&
        Objects.equals(this.caminhoPasta, requestPesquisar.caminhoPasta) &&
        Objects.equals(this.metadados, requestPesquisar.metadados);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centroCusto, canal, usuario, senha, objectStore, caminhoPasta, metadados);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPesquisar {\n");
    
    sb.append("    centroCusto: ").append(toIndentedString(centroCusto)).append("\n");
    sb.append("    canal: ").append(toIndentedString(canal)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    objectStore: ").append(toIndentedString(objectStore)).append("\n");
    sb.append("    caminhoPasta: ").append(toIndentedString(caminhoPasta)).append("\n");
    sb.append("    metadados: ").append(toIndentedString(metadados)).append("\n");
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

