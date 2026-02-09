def solution(phone_book):
    answer = True
    ss = set(phone_book)
    for phone_number in phone_book:
        temp = ""
        for number in phone_number:
            temp += number
            if temp in ss and temp != phone_number:
                answer = False
    return answer
            
# def solution(phone_book):
#     phone_book.sort()

#     for i in range(len(phone_book)-1):
#         if phone_book[i+1].find(phone_book[i]) == 0:
#             return False
#     return True
            
        