import java.util.Random;

public class CoinFlipSimulation {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int numFlips = 1_000_000;

        System.out.println("Simulating the flipping of a coin one million times...");

        Random random = new Random();
        for (int i = 0; i < numFlips; i++) {
            // Generate a random boolean: true for heads, false for tails
            boolean result = random.nextBoolean();

            if (result) {
                System.out.println("Heads");
                heads++;
            } else {
                System.out.println("Tails");
                tails++;
            }
        }

        System.out.println("Total number of heads: " + heads);
        System.out.println("Total number of tails: " + tails);
    }
}



// #include <iostream>
// #include <cstdlib>  // For rand() and srand()
// #include <ctime>    // For time()

// int main() {
//     // Seed the random number generator
//     std::srand(static_cast<unsigned int>(std::time(nullptr)));

//     int heads = 0;
//     int tails = 0;
//     const int num_flips = 1000000;

//     std::cout << "Simulating the flipping of a coin one million times...\n";

//     for (int i = 0; i < num_flips; ++i) {
//         // Generate a random number (0 or 1)
//         int result = std::rand() % 2;

//         // 0 represents heads, 1 represents tails
//         if (result == 0) {
//             std::cout << "Heads\n";
//             heads++;
//         } else {
//             std::cout << "Tails\n";
//             tails++;
//         }
//     }

//     std::cout << "Total number of heads: " << heads << "\n";
//     std::cout << "Total number of tails: " << tails << "\n";

//     return 0;
// }
