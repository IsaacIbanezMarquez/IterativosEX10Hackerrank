import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



// ENUNCIADO:

// Desnivell ciclista:

/* Donades les altituds d'uns ports de muntanya d'una etapa ciclista de la Volta Catalunya, calcula el desnivell acumulat. Si resulta que el desnivell és negatiu o fins a 400 metres positius el programa escriurà "ETAPA PLANA", si per contra el desnivell és de més de 400 metres acumulats l'etapa es considera "ETAPA MUNTANYA".

image

Input Format

L'entrada correspon a una successió d'enters acabats en -1 que correspon a les altures dels ports, la primera és des d'on es parteix (d'on surt la cursa). El -1 no compta en el càlcul del desnivell i serveix per saber quan acaba l'etapa ciclista.

Constraints

No n'hi ha.

Output Format

S'imprimeix si l'etapa és plana o de muntanya.

Sample Input 0

493 1993 556 1956 2556 861 2361 596 1496 -1
Sample Output 0

ETAPA MUNTANYA
Explanation 0

Seguint l'exemple del Tour de més a dalt, s'han simulat les altimetries que no apareixen, però sí que hi ha el Port de Madeleine (1993m), Port del Galibier (2556m), de l'Izard (2361m) i Les Orres (1496m).

Els punts d'altitud a mesura són:

1r tram: 1993 - 493 = 1500m
2n tram: El 2n tram com que 556 és menor a 1993 no es calcula com a desnivell acumulat.
3r Tram: 1956 - 556 = 1400m
4r Tram: 2556 - 1956 = 600m
5e Tram: El 5e tram com que passem de 2556 a 861, la diferència és negativa i per tant no compta pel desnivell acumulat.
6e Tram: 2361 - 861 = 1500m
7e Tram: desnivell negatiu
8e Tram: 1496 - 596 = 900m
I arribem al -1 que ens indica finalització de cursa.

Per tant el desnivell acumulat sumant tots els trams ascendents és de 5900m, per tant ETAPA DE MUNTANYA */









public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        while ((b != -1))
        {
            if((b-a) > 0)
            {
                count = count + (b-a);

            }
            a = b;
            b = sc.nextInt();

        }

        if (count > 400)
        {
            System.out.println("ETAPA MUNTANYA");
        }
        else
        {
            System.out.println("ETAPA PLANA");
        }








    }
}
