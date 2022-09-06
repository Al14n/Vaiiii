using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Евдокимов
{
    class Program
    {
        static void Main(string[] args)
        {
            int result = 0;
            int a = 0;
            int[] L = { 1, 2, 3, 4, 5, 6, 7 };
            int[] Y = { 5, 4, 3, 2, 1 };
            for(int i = 0; i < L.Length; i++)
            {
                for (int j = 0; j < Y.Length; j++)
                {
                    result = result + Y[j] ^ 3;
                }
                a = a + ((L[i] ^ 2 / (L[i] + 1)) - (L[0] * L[6]) * result);

            }
            Console.WriteLine(a);
        }
    }
}
