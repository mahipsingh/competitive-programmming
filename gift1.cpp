//USACO gift1
/*
ID: quasar.2 
LANG: C++14
TASK: gift1
*/
#include <bits/stdc++.h>
using namespace std;
#define FOR(i, a, b) for (int i = (a); i <= (b); i++)
#define FR(i, a, b) for (int i = (a); i < (b); i++)
#define FORD(i, a, b) for (int i = (a); i >= (b); i--)
#define FRD(i, a, b) for (int i = (a); i > (b); i--)
#define szof(x) (int)(x).size()
#define all(x) x.begin(), x.end()
#define ff first
#define ss second
#define pb push_back
typedef long long lint;
typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;
typedef vector<vi> vvi;
const int INF = 0x3f3f3f3f;
const int MOD = 10000007;
const int MAXN = 13;
string names[MAXN], from, to;
int total, from_idx, to_idx, num_people, money[MAXN];
int main(){
  ios_base::sync_with_stdio(0);cin.tie(0);
  
//  freopen("gift1.in", "r", stdin);
//  freopen("gift1.out", "w", stdout);
  
  int n;
  cin >> n;
  FR(i, 0, n)cin >> names[i];
  while(cin >> from >> total >> num_people){
      if(total == 0  and num_people == 0)continue;
      from_idx = distance(names, find(names, names+n, from));
      money[from_idx] = money[from_idx] - total + (total - (num_people * (total/num_people)));
      FOR(i, 1, num_people){
          cin >> to;
          to_idx = distance(names, find(names, names+n, to));
          money[to_idx] += total / num_people;
      }
  }
  FR(i, 0, n){
      cout << names[i] << " " << money[i] << '\n';
  }
  return 0;
}
