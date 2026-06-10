public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;

    private List<Estudiante> estudiantesInscritos = new ArrayList<>();
    private List<Estudiante> estudiantesEnEsperaDeInscripcion = new ArrayList<>();
    private List<Foro> foros = new ArrayList<>();
    private List<ActividadSumativa> actividadesSumativas = new ArrayList<>();
}
