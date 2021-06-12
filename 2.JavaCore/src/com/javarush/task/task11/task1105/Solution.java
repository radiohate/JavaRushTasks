package com.javarush.task.task11.task1105;

/* 
ИТ-компания
Классы Programmer, ProjectManager и CTO должны быть унаследованы от класса IT.
11. Классы HR, Cleaner и OfficeManager должны быть унаследованы от класса Clerk.
12. Классы Clerk и IT должны быть унаследованы от класса Worker.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Worker {

    }

    public class Clerk extends Worker{

    }

    public class IT extends Worker{

    }

    public class Programmer extends IT{

    }

    public class ProjectManager extends IT {

    }

    public class CTO  extends IT{

    }

    public class OfficeManager extends Clerk{

    }

    public class HR  extends Clerk{

    }

    public class Cleaner extends Clerk {

    }
}
