class LogicalOpTable
{
    public static void main(String[]args)
    {
        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true; q = true;
        if (p == true)
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("0");
        }

        if (q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (p&q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (p|q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (p^q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (!p == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.println("\t\t0");
        }

        p = true; q = false;
        if (p == true)
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("0");
        }

        if (q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (p&q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (p|q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (p^q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (!p == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.println("\t\t0");
        }

        p = false; q = true;
        if (p == true)
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("0");
        }

        if (q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (p&q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (p|q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (p^q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (!p == true)
        {
            System.out.println("\t\t1");
        }
        else
        {
            System.out.println("\t\t0");
        }

        p = false; q = false;

        if (p == true)
        {
            System.out.print("1");
        }
            else
            {
                System.out.print("0");
            }

        if (q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (p&q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (p|q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (p^q == true)
        {
            System.out.print("\t\t1");
        }
        else
        {
            System.out.print("\t\t0");
        }
        if (!p == true)
        {
            System.out.println("\t\t1");
        }
        else
        {
            System.out.println("\t\t0");
        }

    }
}
