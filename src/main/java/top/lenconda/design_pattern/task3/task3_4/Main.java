package top.lenconda.design_pattern.task3.task3_4;

public class Main {
    public static void main(String[] args) {
        UnitedNations[] departments = {new WTO(), new WHO(), new WFC()};
        Country[] countries = {new China(), new Japan(), new UK(), new USA()};

        for (UnitedNations department : departments) {
            for (Country country : countries) {
                department.joinCountry(country);
            }
        }

        for (Country country : countries) {
            country.setWfc(departments[2]);
            country.setWho(departments[1]);
            country.setWto(departments[0]);
        }

        countries[0].sendMessageByWTO("UK", "To UK: A message from China");
        countries[1].sendMessageByWTO("USA", "To USA: A message from Japan");
        countries[2].sendMessageByWTO("China", "To China: A message from UK");
        countries[3].sendMessageByWTO("China", "To China: A message from USA");
    }
}
