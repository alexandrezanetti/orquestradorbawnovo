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
import cgcc.integracao.pastas.Metadado;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Define as pastas que deverão ser criadas a partir do caminho base. Exemplo: /GCC/Abertura Conta/Processos/&lt;nivel 1&gt;/&lt;nivel 2&gt;
 */
@ApiModel(description = "Define as pastas que deverão ser criadas a partir do caminho base. Exemplo: /GCC/Abertura Conta/Processos/<nivel 1>/<nivel 2>")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-05T16:43:43.593Z")
public class Pasta {
  @SerializedName("nivel")
  private Integer nivel = null;

  @SerializedName("nome")
  private String nome = null;

  @SerializedName("classePasta")
  private String classePasta = null;

  @SerializedName("metadados")
  private List<Metadado> metadados = new ArrayList<Metadado>();

  public Pasta nivel(Integer nivel) {
    this.nivel = nivel;
    return this;
  }

   /**
   * Nível, a partir do caminho base, no qual a pasta deverá ser criada
   * @return nivel
  **/
  @ApiModelProperty(example = "1", required = true, value = "Nível, a partir do caminho base, no qual a pasta deverá ser criada")
  public Integer getNivel() {
    return nivel;
  }

  public void setNivel(Integer nivel) {
    this.nivel = nivel;
  }

  public Pasta nome(String nome) {
    this.nome = nome;
    return this;
  }

   /**
   * Nome da pasta a ser criada
   * @return nome
  **/
  @ApiModelProperty(example = "1382", required = true, value = "Nome da pasta a ser criada")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Pasta classePasta(String classePasta) {
    this.classePasta = classePasta;
    return this;
  }

   /**
   * Classe da pasta a ser criada no FileNet
   * @return classePasta
  **/
  @ApiModelProperty(example = "Folder", required = true, value = "Classe da pasta a ser criada no FileNet")
  public String getClassePasta() {
    return classePasta;
  }

  public void setClassePasta(String classePasta) {
    this.classePasta = classePasta;
  }

  public Pasta metadados(List<Metadado> metadados) {
    this.metadados = metadados;
    return this;
  }

  public Pasta addMetadadosItem(Metadado metadadosItem) {
    this.metadados.add(metadadosItem);
    return this;
  }

   /**
   * Lista de metadados a serem atribuídos a pasta. Caso nenhum metadado necessite ser atribuido, enviar vazio
   * @return metadados
  **/
  @ApiModelProperty(required = true, value = "Lista de metadados a serem atribuídos a pasta. Caso nenhum metadado necessite ser atribuido, enviar vazio")
  public List<Metadado> getMetadados() {
    return metadados;
  }

  public void setMetadados(List<Metadado> metadados) {
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
    Pasta pasta = (Pasta) o;
    return Objects.equals(this.nivel, pasta.nivel) &&
        Objects.equals(this.nome, pasta.nome) &&
        Objects.equals(this.classePasta, pasta.classePasta) &&
        Objects.equals(this.metadados, pasta.metadados);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nivel, nome, classePasta, metadados);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pasta {\n");
    
    sb.append("    nivel: ").append(toIndentedString(nivel)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    classePasta: ").append(toIndentedString(classePasta)).append("\n");
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

