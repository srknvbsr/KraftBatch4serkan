package day_48_OOP_Rewiev.ScrumTeam;

public class Spofity {//en son kurulan şirket ile içerisini dolduracağız.

    public static void main(String[] args) {


        String departmantName = "Spotify";


        ProductOwner po = new ProductOwner("Dağhan", 30, 'M', "PO", 50000, 32121,
                departmantName);

        BusinessAnaliyst bm = new BusinessAnaliyst("Umit", 35, 'M', 32000, 123212, departmantName);

        ScrumMaster sm = new ScrumMaster("Emine", 40, 'F', 40000, 45631, departmantName);

        Tester tester1 = new Tester("Ugur", 40, 'm', 32000, 323232, departmantName, "Java");
        Tester tester2 = new Tester("İsa", 38, 'm', 25000, 01246, departmantName, "Phyton");
        Tester tester3 = new Tester("Eda", 30, 'F', 32000, 27000, departmantName, "C#");

        Tester[] testers = {tester1, tester2};

        Developer developer1 = new Developer("serkan", 38, 'M', "Developer", 32000, 2124,
                departmantName, "Java");
        Developer developer2 = new Developer("ugur", 39, 'M', "Developer", 32000, 2124,
                departmantName, "Java");
        Developer developer3 = new Developer("nuran", 38, 'F', "Developer", 32000, 2124,
                departmantName, "Java");
        Developer developer4 = new Developer("Ziya", 38, 'M', "Developer", 32000, 2124,
                departmantName, "Java");
        Developer developer5 = new Developer("Emine", 38, 'M', "Developer", 32000, 2124,
                departmantName, "Java");
        Developer[] developers = {developer1, developer2, developer3, developer4};


        ScrumTeam scrumTeam = new ScrumTeam(po, sm, bm);

        scrumTeam.addDeveloper(developer5);
        scrumTeam.addDeveloper(developers);
        scrumTeam.addTester();
        scrumTeam.addTester(testers);
        System.out.println(scrumTeam);
        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name);


        }

    }
}
