using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Евдокимов2
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] familii = new string[] { "Иванов", "Есаул", "Викторов", "Бобров" };
            bool check = false;

            for (int i = 0; i < familii.Length; i++)
            {
                if (familii[i] == "Иванов")
                {

                    check = true;
                    Console.WriteLine("Фамилия Иванов есть");
                }
            }
            if (!check)
                Console.WriteLine("Иванов отсутствует");
        }
    }
}
