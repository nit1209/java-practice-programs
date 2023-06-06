package qsp1;

import java.util.Scanner;



	public class ParkingCharges
	{
		int vehilcleNo ; 
		String vehicleType , vehicleModel, customerName, CheckInTime, CheckOutTime="16:59" ;
		long phoneNo;
		
		public   void checkIn(int vehilcleNo,String vehicleType,String vehicleModel,String customerName,String CheckInTime,long phoneNo) {
			
//			String s = "sachin", sum = "";//casnih
//			
//			for(int i=(s.length()/2)-1;i>=0;i--)
//			{
//				sum=sum+s.charAt(i);
//			}
//			for(int i=s.length()-1;i>=s.length()/2;i--)
//			{
//				sum = sum+s.charAt(i);
//			}
//			System.out.println(sum);
			this.vehilcleNo = vehilcleNo;
			this.vehicleType = vehicleType;
			this.vehicleModel = vehicleModel;
			this.customerName = customerName;
			this.CheckInTime = CheckInTime;
			this.phoneNo = phoneNo;
			serachForVehicle();
			checkOut(CheckOutTime, CheckInTime );
		}
		
		public void displayValetParkingList() {
			System.out.println("vehilcleNo: "+vehilcleNo);
			System.out.println("vehicleType: "+vehicleType);
			System.out.println("vehicleModel: "+vehicleModel);
			System.out.println("vehicleName: "+customerName);
			System.out.println("CheckInTime: "+CheckInTime);
			System.out.println("phoneNo: "+phoneNo);
			System.out.println("checkOutTime:"+CheckOutTime);
		}
		
		public void serachForVehicle() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter vehicle number");
			int vehicleNo = sc.nextInt();
			if(vehicleNo==this.vehilcleNo)
			{
				displayValetParkingList();
			}else
			{
				System.out.println("invalid veicle no");
			}
		}
		
		public void checkOut(String CheckOutTime, String CheckInTime )
		{
			String cot[] = CheckOutTime.split(":");int totalcot = Integer.parseInt(cot[0])*60+Integer.parseInt(cot[1]);
			String cit[] = CheckInTime.split(":");int totalcit = Integer.parseInt(cit[0])*60+Integer.parseInt(cit[1]);
			int mins = totalcot-totalcit;
			if(mins%30==0)
			{
				System.out.println("charges: "+(mins/30)*10);
			}else
			{
				int m = mins/30;
				int lm = mins%30;
				int c = 0;
				if((lm>0 && lm<=30)||(lm>30 && lm<=59))
				{
					c = (m+1)*10;
				}
				System.out.println("charges : "+c);
			}
			
		}
		
		
		public static void main(String[] args) {
			ParkingCharges pc = new ParkingCharges();
			pc.checkIn(12345, "LMV", "BMW", "sunil", "16:00", 7795319679l);
			
		}
	}

