public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.passport = 1111111;
        post.phone = 43454;
        post.subscription = true;
        post.surename = "Иванов";

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 12;
        post.birthday.year = 1999;

    }
}

// Не знаю на сколько правильно я это сделал, но вроде ошибок нет и в дебаге показывает все.