package domain.facultad;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public boolean estaAprobada(){
        return this.materias.stream().allMatch(materia -> this.alumno.correlativasAprobadas(materia));

    }


}
