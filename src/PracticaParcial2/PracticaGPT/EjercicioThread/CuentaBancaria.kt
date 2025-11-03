package PracticaParcial2.PracticaGPT.EjercicioThread

class CuentaBancaria(var saldo: Double){
    @Synchronized
    fun depositar(monto: Double){
        this.saldo+=monto
    }

    @Synchronized
    fun extraer(monto: Double): Boolean{
        if(this.saldo<monto){
            return false
        }
        this.saldo-=monto
        return true
    }
}