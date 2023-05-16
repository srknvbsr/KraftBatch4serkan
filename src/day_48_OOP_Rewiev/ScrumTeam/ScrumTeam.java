package day_48_OOP_Rewiev.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    //Classlardan oluşan instance veriable oluşturduk.

    public ProductOwner PO;

    public BusinessAnaliyst BA;

    public ScrumMaster SM;

    public ArrayList<Tester> testers = new ArrayList<>();

    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner PO, ScrumMaster SM,BusinessAnaliyst BA) {
        this.PO = PO;
        this.SM = SM;
        this.BA=BA;
    }

    public void addTester() {

    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);

    }

    public void addDeveloper(Developer[] developers) {
        this.developers.addAll(Arrays.asList(developers));

    }//AddDeveloper overlooading yaptık.

    public void addTester(Tester[] testers) {
        this.testers.addAll(Arrays.asList(testers));
    }//AddDeveloper overlooading yaptık.

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO +
                ", SM=" + SM +
                ", testers=" + testers +
                ", developers=" + developers +
                '}';
    }
}
