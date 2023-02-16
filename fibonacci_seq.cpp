// https://dmoj.ca/problem/fibonacci

#include <map>
#include <iostream>
using namespace std;

const unsigned long long M = 1000000007; 
map<unsigned long long, unsigned long long> F;

unsigned long long f(unsigned long long n) {
	if (F.count(n)) return F[n];
	unsigned long long k = n/2;
	if (n%2==0) { // n=2*k
		return F[n] = (f(k)*f(k) + f(k-1)*f(k-1)) % M;
	} else { // n=2*k+1
		return F[n] = (f(k)*f(k+1) + f(k-1)*f(k)) % M;
	}
}

main(){
	unsigned long long n;
	F[0] = F[1] = 1;
	while (cin >> n)
	cout << (n==0 ? 0 : f(n-1)) << endl;
}
