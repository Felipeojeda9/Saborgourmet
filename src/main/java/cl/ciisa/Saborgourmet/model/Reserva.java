package cl.ciisa.Saborgourmet.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCliente;
    private LocalDate fechaReserva; 

    @ManyToOne
    @JoinColumn(name = "mesa_id")
    private Mesa mesa;

    public Reserva() { 
    }

    public Reserva(String nombreCliente, LocalDate fechaReserva, Mesa mesa) {
        this.nombreCliente = nombreCliente;
        this.fechaReserva = fechaReserva;
        this.mesa = mesa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNombreCliente() { 
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public LocalDate getFechaReserva() {
        return fechaReserva;
    }
    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;

    }
    public Mesa getMesa() {
        return mesa;
    }
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
}