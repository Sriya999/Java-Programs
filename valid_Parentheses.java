class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]

        for i in s:
            if i in "([{":
                stack.append(i)
            else:
                if len(stack)==0:
                    return False
                top=stack.pop()
                if top=='(' and i!=')':
                    return False
                elif top=='[' and i!=']':
                    return False
                elif top=='{' and i!='}':
                    return False
        if stack: #inbalance parenthesis
            return False
        return True
