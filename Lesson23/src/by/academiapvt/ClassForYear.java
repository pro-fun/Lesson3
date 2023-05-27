package by.academiapvt;

public class ClassForYear {
    @AcademyInfo(year = "2022")
    private void yearWithAnnotation(){
        System.out.println("Год с аннотацией");
    }
    private void yearWithoutAnnotation(){
        System.out.println("Год без аннтотации");
    }
}
