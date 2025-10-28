import java.util.Scanner; //importing Scanner class for user input

/*---- Defining a class for calculating volume of 3D figures --- */
class VolumeCalculator
{
    //method for calculating volume of cube
    private static void calculateVolume(int side)
    {
        System.out.println("----- Cube --------");
        System.out.println("Side : "+side+" cm");
        //formula for cube volume = side³
        System.out.println("Volume : "+(side*side*side)+" cubic cm");
        System.out.println("-------------------------------");
    }

    // method for calculating volume of the sphere
    private static void calculateVolume(float radius)
    {
        //formula for sphere volume = (4/3)*π*r³
        double volume = (4 * 3.14 *radius * radius*radius)/3;
        System.out.println("----- Sphere--------");
        System.out.println("Radius : "+radius+" cm");
        System.out.println("Volume : "+volume+" cubic cm");
        System.out.println("-------------------------------");
    }

    // method for calculating volume of the hemisphere
    private static void calculateVolume(double radius)
    {
        //formula for hemisphere volume = (2/3)*π*r³
        double volume = (2 * 3.14 *radius * radius*radius)/3;
        System.out.println("----- Hemi Sphere--------");
        System.out.println("Radius : "+radius+" cm");
        System.out.println("Volume : "+volume+" cubic cm");
        System.out.println("-------------------------------");
    }

    //method for calculating volume of the cuboid
    private static void calculateVolume(int length,int breadth,int height)
    {
        System.out.println("----- Cuboid --------");
        System.out.println("Length : "+length+" cm");
        System.out.println("Breadth : "+breadth+" cm");
        System.out.println("Height : "+height+" cm");
        //formula for cuboid volume = length × breadth × height
        System.out.println("Volume : "+(length * breadth * height)+" cubic cm");
        System.out.println("-------------------------------");
    }

    //method for calculating volume of the cylinder
    private static void calculateVolume(int height,float radius)
    {
        //formula for cylinder volume = π*r²*h
        double volume = 3.14 * radius * radius * height;
        System.out.println("-------- Cylinder ----------");
        System.out.println("Radius of Base : "+radius+" cm");
        System.out.println("Height : "+height+" cm");
        System.out.println("Volume : "+volume+" cubic cm");
        System.out.println("-------------------------------");
    }

    //method for calculating volume of the cone
    private static void calculateVolume(float radius,int height)
    {
        //formula for cone volume = (1/3)*π*r²*h
        double volume = (3.14 * radius * radius * height)/3;
        System.out.println("-------- Cone ----------");
        System.out.println("Radius of Base : "+radius+" cm");
        System.out.println("Height : "+height+" cm");
        System.out.println("Volume : "+volume+" cubic cm");
        System.out.println("-------------------------------");
    }

    //method for performing operations for calculating volume of 3D figures
    public static void volumeCalculation()
    {
        int operation,choice;
        //creating object of Scanner class to take input from user
        Scanner sc =new Scanner(System.in);
        do{
            //displaying menu for user to select 3D shape
            System.out.println("----- ThreeD Figures Voulme Caluation --------");
            System.out.println("1. Cube");
            System.out.println("2. Cuboid");
            System.out.println("3. Cylinder");
            System.out.println("4. Cone");
            System.out.println("5. Sphere");
            System.out.println("6. Hemi Sphere");
            System.out.println("---------------------------------");
            System.out.print("Select any one operation : ");
            operation = sc.nextInt(); //taking user's choice

            //using switch-case to perform specific shape's volume calculation
            switch (operation) {
                case 1: //if user selects Cube
                    System.out.println("------ Selected Figure : Cube");
                    System.out.println("Enter Side(in cm) : ");
                    int side = sc.nextInt();
                    calculateVolume(side);
                    break;

                case 2: //if user selects Cuboid
                    System.out.println("------ Selected Figure : Cuboid");
                    System.out.println("Enter length(in cm) : ");
                    int length = sc.nextInt();
                    System.out.println("Enter breadth(in cm) : ");
                    int breadth = sc.nextInt();
                    System.out.println("Enter height(in cm) : ");
                    int height = sc.nextInt();
                    calculateVolume(length,breadth,height);                
                    break;

                case 3: //if user selects Cylinder
                    System.out.println("------ Selected Figure : Cylinder");
                    System.out.println("Enter radius(in cm) : ");
                    float radius = sc.nextFloat();
                    System.out.println("Enter height(in cm) : ");
                    int cy_height = sc.nextInt();
                    calculateVolume(cy_height,radius);                
                    break;

                case 4: //if user selects Cone
                    System.out.println("------ Selected Figure : Cone");
                    System.out.println("Enter radius(in cm) : ");
                    float co_radius = sc.nextFloat();
                    System.out.println("Enter height(in cm) : ");
                    int co_height = sc.nextInt();
                    calculateVolume(co_radius,co_height);                
                    break;

                case 5: //if user selects Sphere
                    System.out.println("------ Selected Figure : Sphere");
                    System.out.println("Enter radius(in cm) : ");
                    float sp_radius = sc.nextFloat();
                    calculateVolume(sp_radius);                
                    break;

                case 6: //if user selects Hemisphere
                    System.out.println("------ Selected Figure : hemi Sphere");
                    System.out.println("Enter radius(in cm) : ");
                    double hs_radius = sc.nextDouble();
                    calculateVolume(hs_radius);                
                    break;

                default: //if user enters wrong option
                    System.out.println("Invalid operation");
            }

            System.out.println("---------------------------------");
            //asking user if they want to continue or exit
            System.out.print("Press 0 to exit or any other number to continue : ");
            choice = sc.nextInt(); //reading user's choice

        }while(choice!=0); //loop continues until user presses 0
    }
}

/*--- Initial class having main method ---*/
public class ThreeDFiguresOperation {
    public static void main(String[] args) {
        //calling method to perform volume calculation of 3D figures
        VolumeCalculator.volumeCalculation();
    }
}
