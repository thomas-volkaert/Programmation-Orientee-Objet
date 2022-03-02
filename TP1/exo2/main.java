package TP1.exo2;
public class main{
    NbMyst2 a = new NbMyst2();
    a.BorderMin(Integer.parseInt(args[0]));
    a.BorderMax(Integer.parseInt(args[1]));
    a.RandomGen();
    a.Start();
}

