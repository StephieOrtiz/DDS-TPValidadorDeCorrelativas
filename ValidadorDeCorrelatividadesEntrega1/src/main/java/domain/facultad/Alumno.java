package domain.facultad;

import java.util.List;

public class Alumno {
    private String nombre;
    public void setNombre(String emiliano) {
    }
    private String apellido;
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    private List<Materia>materiasAprobadas;

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public Alumno(String nombre, String apellido, List<Materia>materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean aprobo(Materia unaMateria){
        return this.materiasAprobadas.contains(unaMateria);
    } //me fijo en la lista de materias aprobadas si aprobo una materia

    public boolean correlativasAprobadas(Materia unaMateria){
        return unaMateria.getMateriasCorrelativas().stream().allMatch(this::aprobo);
    }


}
