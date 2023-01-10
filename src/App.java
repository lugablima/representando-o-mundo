public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.setName("Matemática");
        subject.setDescription("É de boa");
        subject.summary.setTitle("Soma");
        subject.summary.setContent("1 + 1 = 2");

        System.out.println(subject.getName());
        System.out.println(subject.getDescription());
        System.out.println(subject.summary.getTitle());
        System.out.println(subject.summary.getContent());
    }
}
