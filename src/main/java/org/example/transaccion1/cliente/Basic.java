package org.example.transaccion1.cliente;

import org.example.transaccion1.transacciones.IConsultaSaldo;
import org.example.transaccion1.transacciones.IPagoServicio;
import org.example.transaccion1.transacciones.IRetiroEfectivo;

public class Basic extends Cliente implements IPagoServicio, IConsultaSaldo, IRetiroEfectivo {

    public void consultarSaldo() {
        IConsultaSaldo.super.consultarSaldo();
    }

    public void retirarEfectivo() {
        IRetiroEfectivo.super.retirarEfectivo();
    }

    public void pagarServicio() {
        IPagoServicio.super.pagarServicio();
    }
}
