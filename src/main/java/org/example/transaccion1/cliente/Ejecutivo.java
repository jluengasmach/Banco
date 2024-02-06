package org.example.transaccion1.cliente;

import org.example.transaccion1.transacciones.IDeposito;
import org.example.transaccion1.transacciones.ITransferencia;

public class Ejecutivo extends Cliente implements IDeposito, ITransferencia {
    public void depositar() {
        IDeposito.super.depositar();
    }

    public void transferir() {
        ITransferencia.super.transaccionNoOk();
    }
}
