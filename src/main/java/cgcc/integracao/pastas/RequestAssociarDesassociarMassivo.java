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
 * Contempla o conteúdo a ser enviado na requisição para associação/desassociação de conteúdos de uma pasta de origem para uma pasta de destino, no repositório GCC
 */
@ApiModel(description = "Contempla o conteúdo a ser enviado na requisição para associação/desassociação de conteúdos de uma pasta de origem para uma pasta de destino, no repositório GCC")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-05T16:43:43.593Z")
public class RequestAssociarDesassociarMassivo {
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

  @SerializedName("caminhoOrigem")
  private String caminhoOrigem = null;

  @SerializedName("caminhoDestino")
  private String caminhoDestino = null;

  public RequestAssociarDesassociarMassivo centroCusto(String centroCusto) {
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

  public RequestAssociarDesassociarMassivo canal(String canal) {
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

  public RequestAssociarDesassociarMassivo usuario(String usuario) {
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

  public RequestAssociarDesassociarMassivo senha(String senha) {
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

  public RequestAssociarDesassociarMassivo objectStore(String objectStore) {
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

  public RequestAssociarDesassociarMassivo caminhoOrigem(String caminhoOrigem) {
    this.caminhoOrigem = caminhoOrigem;
    return this;
  }

   /**
   * Caminho da pasta (já existente) onde os conteúdos estão associados (e serão desassociados)
   * @return caminhoOrigem
  **/
  @ApiModelProperty(example = "/GCC/Abertura Conta/Processos/1382/12345", required = true, value = "Caminho da pasta (já existente) onde os conteúdos estão associados (e serão desassociados)")
  public String getCaminhoOrigem() {
    return caminhoOrigem;
  }

  public void setCaminhoOrigem(String caminhoOrigem) {
    this.caminhoOrigem = caminhoOrigem;
  }

  public RequestAssociarDesassociarMassivo caminhoDestino(String caminhoDestino) {
    this.caminhoDestino = caminhoDestino;
    return this;
  }

   /**
   * Caminho da pasta (já existente) à qual os conteúdos serão associados
   * @return caminhoDestino
  **/
  @ApiModelProperty(example = "/GCC/Abertura Conta/Processos/1382/98765", required = true, value = "Caminho da pasta (já existente) à qual os conteúdos serão associados")
  public String getCaminhoDestino() {
    return caminhoDestino;
  }

  public void setCaminhoDestino(String caminhoDestino) {
    this.caminhoDestino = caminhoDestino;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestAssociarDesassociarMassivo requestAssociarDesassociarMassivo = (RequestAssociarDesassociarMassivo) o;
    return Objects.equals(this.centroCusto, requestAssociarDesassociarMassivo.centroCusto) &&
        Objects.equals(this.canal, requestAssociarDesassociarMassivo.canal) &&
        Objects.equals(this.usuario, requestAssociarDesassociarMassivo.usuario) &&
        Objects.equals(this.senha, requestAssociarDesassociarMassivo.senha) &&
        Objects.equals(this.objectStore, requestAssociarDesassociarMassivo.objectStore) &&
        Objects.equals(this.caminhoOrigem, requestAssociarDesassociarMassivo.caminhoOrigem) &&
        Objects.equals(this.caminhoDestino, requestAssociarDesassociarMassivo.caminhoDestino);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centroCusto, canal, usuario, senha, objectStore, caminhoOrigem, caminhoDestino);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestAssociarDesassociarMassivo {\n");
    
    sb.append("    centroCusto: ").append(toIndentedString(centroCusto)).append("\n");
    sb.append("    canal: ").append(toIndentedString(canal)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    objectStore: ").append(toIndentedString(objectStore)).append("\n");
    sb.append("    caminhoOrigem: ").append(toIndentedString(caminhoOrigem)).append("\n");
    sb.append("    caminhoDestino: ").append(toIndentedString(caminhoDestino)).append("\n");
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

