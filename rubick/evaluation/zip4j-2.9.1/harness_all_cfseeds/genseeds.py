import json


with open('cfPicks.json', 'r') as f:
    obj = json.load(f)
    allNum = 0
    for _, v in obj.items():
        allNum = allNum + len(v)
    #print(allNum)

    for i in range(allNum):
        hexstr = (i).to_bytes(4, byteorder='little').hex()
        finalstr = ''
        for j in range(0, len(hexstr), 2):
            finalstr = finalstr + '\\x' + hexstr[j:j+2]
        print('''printf "\\x00\\x00\\x00\\x00%s" | cat ../seeds/sample.zip - > own-seeds/new-%d.zip''' % (finalstr, i))
