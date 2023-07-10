package headfirst.designpatterns.prototype;

public interface Prototype {
    Prototype copy() throws CloneNotSupportedException;
}
