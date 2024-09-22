class Solution:
    def reverse_polish_notation(self, tokens):
        stack = []
        for string in tokens:
            if string not in "*/-+":
                stack.append(int(string))
            else:
                if string == '+':
                    stack.append(stack.pop()+stack.pop())
                elif string=='-':
                    stack.append(-stack.pop()+stack.pop())
                elif string=='*':
                    stack.append(stack.pop()*stack.pop())
                else:
                    stack.append(int(1.0/stack.pop()*stack.pop()))
            
        return stack[0]
