package src.factory;

import java.util.ArrayList;
import java.util.List;
import src.observer.Observer;
import src.observer.Subject;
import src.singleton.ConfiguracionSistema;
import src.strategy.EstrategiaEnvio;

public abstract class Pedido implements Subject {

    private EstrategiaEnvio estrategia;

    // Implementacion de los observers.
    private List<Observer> observers = new ArrayList<>();
    private String estado;

    // Lógica de creacion de los observer.
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.actualizar(estado);
        }
    }

    // Cambiar de estado para notificar a cliente y logistica.
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notifyObservers();
    }

    
    public void setEstrategia(EstrategiaEnvio estrategia) {
        this.estrategia = estrategia;
    }

    // Getter para el estado.
    public String getEstado() {
        return estado;
    }

    public double calcularCosto(double base) {
        ConfiguracionSistema config = ConfiguracionSistema.getInstance();
        return estrategia.calcularCosto(base, config);
    }
}