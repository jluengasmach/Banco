package org.example.transaccion1.cliente;

import org.example.transaccion1.transacciones.IConsultaSaldo;
import org.example.transaccion1.transacciones.IRetiroEfectivo;

public class Cobrador extends Cliente implements IRetiroEfectivo, IConsultaSaldo {
    public void consultarSaldo() {
        IConsultaSaldo.super.consultarSaldo();
    }

    public void retirarEfectivo() {
        IRetiroEfectivo.super.retirarEfectivo();
    }
}
