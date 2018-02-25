#include <iostream>
#include <string>
#include <vector>
#include <map>
#include <cctype>
#include<algorithm>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
	ListNode* deleteDuplicates(ListNode* head) {
		if (head == NULL) return head;

		map<int, int> collect;
		ListNode* iter = head;
		while (iter != NULL) {
			collect[iter->val]++;
			iter = iter->next;
		}

		ListNode* result = new ListNode(0);
		ListNode* ptr = result;

		for (map<int, int>::iterator iter = collect.begin(); iter != collect.end(); iter++) {
			if (iter->second == 1) {
				ptr->next = new ListNode(iter->first);
				ptr = ptr->next;
			}
		}
		return result->next;
	}
};