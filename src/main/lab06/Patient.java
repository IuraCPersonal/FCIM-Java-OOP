package main.lab06;

import java.util.Date;
import java.util.List;

public class Patient {
    protected String id;
    protected FullName name;
    protected Gender gender;
    protected Date birthDay;
    protected int age;
    protected Date accepted;
    protected History sickness;
    protected List<String> prescriptions,
                           allergies,
                           specialReqs;
    protected OperationsStaff operationsStaff;
}
