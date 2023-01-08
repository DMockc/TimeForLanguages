import time
def numb():
    start = time.time() #Starts time
    count = 0
    while count <= 100000:
        print(count)
        count += 1

    end = time.time() #Ends time
    stime = end - start #Sets time
    print("\nCurrent time: " + str(stime) + " seconds.")

if __name__ == '__main__':
    numb()