package softwarecoding007;

public class SoftwareCoding007_practice004 {

	public static void main(String[] args) {
		String[] k34_OneRec = {
				" �ڷ�������, ������, ����ڵ�Ϲ�ȣ, ����尡�Ի����ڵ� 1 ��� 2 Ż��, ������ȣ, ������������ּ�, ����嵵�θ����ּ�, �����������ּ��ڵ�, �����������ּ��ڵ�, �������ּұ����õ��ڵ�, �������ּұ����ýñ����ڵ�, �������ּұ����ýñ������鵿�ڵ�, ��������±����ڵ� 1 ���� 2 ����, ���������ڵ�, ���������ڵ��, ��������, �����ڼ�, ��������ݾ�, �ű�����ڼ�, ��ǰ����ڼ�",
				"2022-03,(��)�������ڸ���,211814,1,31409,��û���� �ƻ�� ������,��û���� �ƻ�� ������ �ƻ�븮����,4420036032,4420036032,44,200,360,1,252901,����� �ö�ƽ ������� ������,1988-01-01,590,265736600,5,7",
				"2022-03,�۷ο��� �ֽ�ȸ��,110812,1,06072,����Ư���� ������ û�㵿,����Ư���� ������ �������137��,1168010400,1168056500,11,680,104,1,452101,����  Ÿ�� �� ��� �����,1988-01-01,3,1265560,0,0",
				"2022-03,���ϱ��(��),201810,1,04537,����Ư���� �߱� �湫��2��,����Ư���� �߱� ����,1114012500,1114055000,11,140,125,1,381002,,1988-01-01,19,6079800,0,0",
				"2022-03,�𿡽���(��),104811,1,04526,����Ư���� �߱� ���빮��4��,����Ư���� �߱� �������,1114011700,1114054000,11,140,117,1,701201,���ְſ� �ǹ� �Ӵ��(����  �ڱⶥ),1988-01-01,16,4105100,0,1",
				"2022-03,(��)�췲��,104810,1,04336,����Ư���� ��걸 �ľϵ�,����Ư���� ��걸 �ľϷ�4��,1117010100,1117051000,11,170,101,1,221200,���� �� ���� ���๰ �����,1988-01-01,303,115263100,5,3",
				"2022-03,���մ���(��),102812,1,03143,����Ư���� ���α� ���۵�,����Ư���� ���α� �����2��,1111012400,1111061500,11,110,124,1,221200,���� �� ���� ���๰ �����,1988-01-01,849,378514300,9,10",
				"2022-03,�����ؿ�(��),202814,1,04533,����Ư���� �߱� ������1��,����Ư���� �߱� ������,1114010400,1114055000,11,140,104,1,612000,���� ���� ���� �� ȭ�� ��۾�,1988-01-0,,41,15096140,1,0",
				"2022-03,������ڸ��� ����ȸ��,214810,1,07335,����Ư���� �������� ���ǵ���,����Ư���� �������� ���Ǵ��,1156011000,1156054000,11,560,110,1, ,,1988-01-0,,27,12200660,0,0",
				"2022-03,�����(��),113810,1,08507,����Ư���� ��õ�� ���굿,����Ư���� ��õ�� ���������1��,1154510100,1154551000,11,545,101,1,602305,�Ϲ� ȭ�� �ڵ��� ��۾�,1988-01-01,18,4802820,0,0",
				"2022-03,(��)�ŵ��������,120811,1,06179,����Ư���� ������ ��ġ��,����Ư���� ������ �������88��,1168010600,1168062000,11,680,106,1,515050,��ǻ�� �� �ֺ���ġ  ����Ʈ���� ���ž�,1988-01-01,10,3025160,0,0"
				};
		
		String[] k34_fieldName = k34_OneRec[0].split(",");// �� �ʵ���� k34_OneRec �迭�� 0��° �ε��� ������ �޸��� ���� �����´�.
		for (int k34_i = 1; k34_i < k34_OneRec.length; k34_i++) { // �ʵ���� ���ܽ��Ѿ� �ϱ� ������ k34_i = 1���� �����ϰ�, k34_OneRec �迭�� ���̿��� - 1�� �� ��ŭ �ݺ��Ѵ�.
			String[] k34_field = k34_OneRec[k34_i].split(",");// �޸��� ������ �ʵ� ���� k34_field �迭�� �����Ѵ�.
			System.out.printf("******************************************\n");
			for (int k34_j = 0; k34_j < k34_fieldName.length; k34_j++) {// ����� ���� �ݺ�������, �ʵ�� �迭�� ���̸�ŭ �ݺ��Ѵ�.
				if (k34_j == 17) {
					k34_field[k34_j] = k34_readNum(k34_field[k34_j]);
				}
				System.out.printf(" %s : %s\n", k34_fieldName[k34_j], k34_field[k34_j]);// �ʵ�� : �ʵ� ������� ����Ѵ�.
			}
			System.out.printf("******************************************\n");
		}
	}
		
		static String k34_readNum(String k34_str) {
			String k34_numRead = "";// ���� ���ڸ� ������ ����
			int k34_i, k34_j;// int���� kopo34_i�� kopo34_j�� �����Ѵ�.
			String[] k34_unitS = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };// ���ڸ� �б� ���� string �迭 kopo34_unitS�� �����ϰ� �ʱ�ȭ�Ѵ�.
			String[] k34_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };// �ڸ����� �б� ���� string �迭 kopo34_unitX�� �����ϰ� �ʱ�ȭ�Ѵ�.
			// ���ʺ��� �Ѱ��� ó��
			k34_i = 0;// kopo34_i�� 0���� �ʱ�ȭ�Ѵ�.(���ڸ� �б� ���� �ε����� Ȱ��)
			k34_j = k34_str.length() - 1;// kopo34_j�� kopo34_sNumVal �迭�� ���� - 1 �� ������ �ʱ�ȭ�Ѵ�.(�ڸ����� �б� ���� �ε����� Ȱ��)
			
			while (true) {// break������ ���������� ������ ���� �ݺ��ϴ� while���� �ۼ��Ѵ�.
				if (k34_i >= k34_str.length()) {// ���� kopo34_i�� �迭�� ���̿� ���ų� Ŀ����
					break;// while���� �������´�.
				}
				
				if (k34_str.substring(k34_i, k34_i + 1).equals("0")) {// ���� �߶� k34_str�� ���� 0�̶��
					if (k34_unitX[k34_j].equals("��") | k34_unitX[k34_j].equals("��")) {// �� ���� �ڸ����� "��"�̰ų� "��"�̶��
						k34_numRead += "" + k34_unitX[k34_j];// ���� 0�̱� ������ k34_numRead�� �ڸ����� �ٿ��ش�.
					} else {// �ڸ����� "��"�̳� "��"�� �ƴ϶�� �ƹ��͵� ���� �ʴ´�. ("��"�� "��"�� ���ڰ� 0�̾ �ڸ����� �ٿ��ֱ� ����)
						
					}
					
				} else {// ���� �߶� k34_str�� ���� 0�� �ƴ϶��
					k34_numRead +=
							k34_unitS[Integer.parseInt(k34_str.substring(k34_i, k34_i + 1))]// kopo34_i���� kopo34_i + 1���� �迭�� ���� �ڸ���. ��, k34_i���� �ε��� ���� �����´�.
																										    // �׸��� string�� integer�� ��ȯ�� ���� -> �ѱ۷� ���� ���� ������ k34_numRead�� �߰��Ѵ�.
							+ k34_unitX[k34_j]; // �ڸ����� ���� ���� ������ k34_numRead�� �߰��Ѵ�.
				}
				
				k34_i ++;// kopo34_i�� 1�� ���Ѵ�.(������)
				k34_j --;// kopo34_j�� 1�� ����.(������)
			
			}
			return k34_numRead + "��";
		
	}
}