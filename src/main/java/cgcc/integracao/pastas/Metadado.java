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
 * Contempla o nome, valor e tipo do metadado a ser incluido na pasta
 */
@ApiModel(description = "Contempla o nome, valor e tipo do metadado a ser incluido na pasta")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-05T16:43:43.593Z")
public class Metadado {
  @SerializedName("nome")
  private String nome = null;

  @SerializedName("valor")
  private String valor = null;

  /**
   * Tipo da propriedade no repositório GCC
   */
  @JsonAdapter(TipoEnum.Adapter.class)
  public enum TipoEnum {
    BOOLEAN("BOOLEAN"),
    
    DATE("DATE"),
    
    FLOAT("FLOAT"),
    
    INTEGER("INTEGER"),
    
    LONG("LONG"),
    
    STRING("STRING");

    private String value;

    TipoEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TipoEnum fromValue(String text) {
      for (TipoEnum b : TipoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TipoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TipoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TipoEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TipoEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("tipo")
  private TipoEnum tipo = null;

  public Metadado nome(String nome) {
    this.nome = nome;
    return this;
  }

   /**
   * Nome da propriedade no repositório GCC
   * @return nome
  **/
  @ApiModelProperty(example = "GccDtContrato", required = true, value = "Nome da propriedade no repositório GCC")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Metadado valor(String valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Valor da propriedade no repositório GCC. Para metadado do tipo DATE que inclua apenas a data, o valor deve estar no formato &#39;yyyyMMdd&#39; e quando incluir hora &#39;yyyyMMdd HHmmss&#39;
   * @return valor
  **/
  @ApiModelProperty(example = "20190801 102658", required = true, value = "Valor da propriedade no repositório GCC. Para metadado do tipo DATE que inclua apenas a data, o valor deve estar no formato 'yyyyMMdd' e quando incluir hora 'yyyyMMdd HHmmss'")
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public Metadado tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

   /**
   * Tipo da propriedade no repositório GCC
   * @return tipo
  **/
  @ApiModelProperty(example = "DATE", required = true, value = "Tipo da propriedade no repositório GCC")
  public TipoEnum getTipo() {
    return tipo;
  }

  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadado metadado = (Metadado) o;
    return Objects.equals(this.nome, metadado.nome) &&
        Objects.equals(this.valor, metadado.valor) &&
        Objects.equals(this.tipo, metadado.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, valor, tipo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadado {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

