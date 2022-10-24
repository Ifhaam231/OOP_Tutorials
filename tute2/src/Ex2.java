public class Ex2 {

    public Ex2() {

        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";

        String all = animal1.concat(animal2);
        System.out.println(article.concat(animal1.concat(action.concat(animal2))));

        System.out.println(article + "\s" + animal1 + "\s" + action + "\s" + animal2);
    }
}