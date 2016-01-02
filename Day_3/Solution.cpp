#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    double m; 
    int t, x;
    cin >> m >> t >> x;
    
    double tip = m * t / 100;
    double tax = m * x / 100;
    
    int total = (int) round(m + tip + tax);
    
    cout << "The final price of the meal is $" + to_string(total) + "." << endl;
    return 0;
}
