from ListNode import ListNode
from typing import Optional

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        prev:ListNode = head
        i:int=0
        curr:ListNode = head
        
        if not head.next: return None
        
        while curr.next:
            i = i+1
            curr = curr.next
            
            if i <= n: continue
            prev = prev.next
        
        if i >= n:
            prev.next = prev.next.next
        else:
            return head.next
        
        return head
        
        
if __name__ == '__main__':
    def printList(head:ListNode):
        while head:
            print(head.val)
            head = head.next
    
    head = ListNode(val=1)
    # head.setNext(ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
    head.setNext(ListNode(2))
    printList(head)
    head = Solution().removeNthFromEnd(head=head, n=2)
    printList(head)