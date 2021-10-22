package com.company;

class Officers {

    String name;
    String surname;
    int officerId;
    String workingDistrict;
    int crimesSolved;

    Officers(String name, String surname, int officerID, String workingDistrict, int crimesSolved) {
        this.name = name;
        this.surname = surname;
        this.officerId = officerID;
        this.workingDistrict = workingDistrict;
        this.crimesSolved = crimesSolved;
    }


    //  public static void main(String[] args) {

    //            Officers a = new Officers(
    //                    "John", "Star", 12345, "Paris", 11);


    public String toString() {
        return name + " " + surname + " " + officerId + " " + workingDistrict + " " + crimesSolved;

    }

    public static void main(String[] args) {

        Officers a = new Officers(
                "John", "Star", 12345, "Paris",
                11);

        //System.out.println(a);

        System.out.println(a.toString());
    }


    public void calculatedLevel() {
// not ready yet

        int crimesSolved = 11;


        if (crimesSolved < 20)
            System.out.println("level is 1");

        else if (crimesSolved > 20 && crimesSolved < 40)
            System.out.println("Level is 2");

        else System.out.println("Level is 3");
    }


}

