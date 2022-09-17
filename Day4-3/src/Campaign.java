
public class Campaign {
		String campaignName; 
		
		String campaignDiscount; 
		String campaignDate; 
		
		public Campaign(String campaignName, String campaignDiscount, String campaignDate) {
			super();
			this.campaignName = campaignName;
			this.campaignDiscount = campaignDiscount;
			this.campaignDate = campaignDate;
		}

		public String getCampaignName() {
			return campaignName;
		}

		public void setCampaignName(String campaignName) {
			this.campaignName = campaignName;
		}

		public String getCampaignDiscount() {
			return campaignDiscount;
		}

		public void setCampaignDiscount(String campaignDiscount) {
			this.campaignDiscount = campaignDiscount;
		}

		public String getCampaignDate() {
			return campaignDate;
		}

		public void setCampaignDate(String campaignDate) {
			this.campaignDate = campaignDate;
		}
		
		
		
}
