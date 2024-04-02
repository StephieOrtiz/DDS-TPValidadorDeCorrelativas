package domain.facultad;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

public class InscripcionTest {
private Alumno emiliano;
private Materia algoritmos;
private Materia pdep;
private Materia disenio;

private Inscripcion nuevaInscripcion;

@BeforeEach

    public void initial() {
    algoritmos = new Materia("Algoritmos");

    pdep = new Materia("Pdep");

    pdep.setMateriasCorrelativas(List.of(new Materia[]{algoritmos}));

    disenio = new Materia("Disenio");
    disenio.setMateriasCorrelativas(List.of(new Materia[]{algoritmos,pdep}));
    //creo una lista con las materias correlativas y se las seteo a disenio
}
@Test
@DisplayName("La inscripcion esta aceptada")
public void inscripcionAceptadaTest(){

    emiliano = new Alumno("Emiliano","Oliveira", List.of(new Materia[]{algoritmos,pdep}));

    nuevaInscripcion = new Inscripcion(emiliano,List.of(new Materia[]{disenio}));
    Assertions.assertTrue(nuevaInscripcion.estaAprobada());





}
@Test
@DisplayName("La inscripcion esta rechazada")
    public void inscripcionRechazadaTest(){

        emiliano = new Alumno("Emiliano","Oliveira", List.of(new Materia[]{algoritmos}));

        nuevaInscripcion = new Inscripcion(emiliano,List.of(new Materia[]{disenio}));
        Assertions.assertFalse(nuevaInscripcion.estaAprobada());





    }

}
