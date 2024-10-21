def sort(list : list):
    for i in range(1, len(list)):
        key = list[i]
        flag = i - 1
        while ((flag >= 0) and (list[flag] > key)):
            list[flag + 1] = list[flag]
            flag -= 1
        list[flag + 1] = key   

def main():
    list = ["a", "n", "b"]
    sort(list)
    for i in list:
        print(i)

if __name__ == "__main__":
    main()