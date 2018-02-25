#include <iostream>

class Solution
{
public:
	ListNode* addTwoNumbers(ListNode* l1, ListNode* l2)
	{
		ListNode* result = new ListNode((l1->val + l2->val) % 10);
		int value = 0;
		int value1 = 0;
		int value2 = 0;
		bool C = (l1->val + l2->val) > 9 ? true : false;
		ListNode* ptr = result;
		l1 = l1->next;
		l2 = l2->next;

		while (l1 != NULL||l2 != NULL)
		{
			if (l1 != NULL) value1 = l1->val;
			else value1 = 0;
			if (l2 != NULL) value2 = l2->val;
			else value2 = 0;

			if (C) value = value1 + value2 + 1;
			else value = value1 + value2;
			ListNode* ptrr = new ListNode(value);
			ptr->next = ptrr;

			if (value > 9)
			{
				C = true;
				ptrr->val -= 10;
			}
			else C = false;

			if (l1 == NULL || l1->next == NULL)
				l1 = NULL;
			else l1 = l1->next;

			if (l2 == NULL || l2->next == NULL)
				l2 = NULL;
			else l2 = l2->next;
			ptr = ptr->next;
		}

		if (C)
		{
			ListNode* ptrr = new ListNode(1);
			ptr->next = ptrr;
		}

		return result;
	}
};