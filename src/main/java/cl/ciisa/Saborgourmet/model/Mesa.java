package cl.ciisa.Saborgourmet.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mesas")
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numero;
    private Integer capacidad;
    private Boolean disponible; 

    public Mesa () {
    }

    public Mesa(Integer numero, Integer capacidad, Boolean disponible) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.disponible = disponible;
    }
    
    public Long getId() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidad() {
        return capacidad;
    }
    
    public Boolean getDisponible() { 
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}
