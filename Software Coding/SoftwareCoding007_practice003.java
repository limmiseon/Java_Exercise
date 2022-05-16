package softwarecoding007;

public class SoftwareCoding007_practice003 {

	public static void main(String[] args) {
		String[] k34_OneRec = {
				"��ȣ,��ġ��Ҹ�,��ġ��һ�,��ġ�õ���,��ġ�ñ�����,��ġ�ü�����,�����������,��������SSID,��ġ����,���������θ��ּ�,�����������ּ�,���������,���������ȭ��ȣ,����,�浵,�����ͱ�������",
				"1,�̾Ƶ�����û��,4F ����������,����Ư����,���ϱ�,������,���ϱ�û,PublicWiFi@Gangbuk,2012-01,����Ư���� ���ϱ� �ָŷ�49�� 14,����Ư���� ���ϱ� �̾Ƶ� 197-1,���ϱ�û,02-901-7212,37.6270597,127.0270449,2020-06-15",
				"2,���Ǽ�,1F �����,����Ư����,���ϱ�,������,���ϱ�û,PublicWiFi@Gangbuk,2012-01,����Ư���� ���ϱ� ��õ�� 897,����Ư���� ���ϱ� ���� 232,���ϱ�û,02-901-7212,37.6322163,127.0387405,2020-06-15",
				"3,���Ǽ�,3F �������ǰ� �� ����,����Ư����,���ϱ�,������,���ϱ�û,PublicWiFi@Gangbuk,2012-01,����Ư���� ���ϱ� ��õ�� 897,����Ư���� ���ϱ� ���� 232,���ϱ�û,02-901-7212,37.6322163,127.0387405,2020-06-15",
				"4,���Ǽ�,4F ����������,����Ư����,���ϱ�,������,���ϱ�û,PublicWiFi@Gangbuk,2012-01,����Ư���� ���ϱ� ��õ�� 897,����Ư���� ���ϱ� ���� 232,���ϱ�û,02-901-7212,37.6322163,127.0387405,2020-06-15",
				"5,�ﰢ�꺸�Ǻм�,1F �����,����Ư����,���ϱ�,������,���ϱ�û,PublicWiFi@Gangbuk,2012-01,����Ư���� ���ϱ� ����19�� 154,����Ư���� ���ϱ� �̾Ƶ� 1353-8,���ϱ�û,02-901-7212,37.6170342,127.0156591,2020-06-15",
				"6,�ﰢ�꺸�Ǻм�,2F �湮��ȣ���,����Ư����,���ϱ�,������,���ϱ�û,PublicWiFi@Gangbuk_Secure,2012-01,����Ư���� ���ϱ� ����19�� 154,����Ư���� ���ϱ� �̾Ƶ� 1353-8,���ϱ�û,02-901-7212,37.6170342,127.0156591,2020-06-15",
				"7,���ϱ���ȸ,���� 1F ��ȸ�繫��,����Ư����,���ϱ�,������,���ϱ�û,PublicWiFi@Gangbuk,2012-01,����Ư���� ���ϱ� �ﰢ��� 89,����Ư���� ���ϱ� �μ��� 605-328,���ϱ�û,02-901-7212,37.6406393,127.0140761,2020-06-15",
				"8,���ϱ���ȸ,���� 2F ��1����ȸ��,����Ư����,���ϱ�,������,���ϱ�û,PublicWiFi@Gangbuk,2012-01,����Ư���� ���ϱ� �ﰢ��� 89,����Ư���� ���ϱ� �μ��� 605-328,���ϱ�û,02-901-7212,37.6406393,127.0140761,2020-06-15",
				"9,���ϱ���ȸ,���� 2F ��2����ȸ��,����Ư����,���ϱ�,������,���ϱ�û,PublicWiFi@Gangbuk,2012-01,����Ư���� ���ϱ� �ﰢ��� 89,����Ư���� ���ϱ� �μ��� 605-328,���ϱ�û,02-901-7212,37.6406393,127.0140761,2020-06-15",
				"10,��絿�ֹμ���,1F �ο���,����Ư����,���ϱ�,������,���ϱ�û,PublicWiFi@Gangbuk,2012-01,����Ư���� ���ϱ� ���� 268,����Ư���� ���ϱ� �̾Ƶ� 791-350,���ϱ�û,02-901-7212,37.6273366,127.0183347,2020-06-15"
				};
		
		String[] k34_fieldName = k34_OneRec[0].split(",");// �� �ʵ���� k34_OneRec �迭�� 0��° �ε��� ������ �޸��� ���� �����´�.
		for (int k34_i = 1; k34_i < k34_OneRec.length - 1; k34_i++) { // �ʵ���� ���ܽ��Ѿ� �ϱ� ������ k34_i = 1���� �����ϰ�, k34_OneRec �迭�� ���̿��� - 1�� �� ��ŭ �ݺ��Ѵ�.
			String[] k34_field = k34_OneRec[k34_i].split(",");// �޸��� ������ �ʵ� ���� k34_field �迭�� �����Ѵ�.
			System.out.printf("******************************************\n");
			
			for (int k34_j = 0; k34_j < k34_fieldName.length; k34_j++) {// ����� ���� �ݺ�������, �ʵ�� �迭�� ���̸�ŭ �ݺ��Ѵ�.
				System.out.printf(" %s : %s\n", k34_fieldName[k34_j], k34_field[k34_j]);// �ʵ�� : �ʵ� ������� ����Ѵ�.
			}
			System.out.printf("******************************************\n");
			
		
			
		}
	}
}