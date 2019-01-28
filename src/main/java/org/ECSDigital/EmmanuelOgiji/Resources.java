package org.ECSDigital.EmmanuelOgiji;

public class Resources {
    public static  String getCompetitions(){ return "/competitions"; }
    public static  String getTeams(String compId){ return "/competitions/"+compId+"/teams"; }
    public static String getTeamProfile(String teamID) {
        return "/teams/"+teamID;
    }
    public static String TeamsBackup() {
        return "{\n" +
                "    \"count\": 20,\n" +
                "    \"filters\": {},\n" +
                "    \"competition\": {\n" +
                "        \"id\": 2021,\n" +
                "        \"area\": {\n" +
                "            \"id\": 2072,\n" +
                "            \"name\": \"England\"\n" +
                "        },\n" +
                "        \"name\": \"Premier League\",\n" +
                "        \"code\": \"PL\",\n" +
                "        \"plan\": \"TIER_ONE\",\n" +
                "        \"lastUpdated\": \"2019-01-21T12:45:04Z\"\n" +
                "    },\n" +
                "    \"season\": {\n" +
                "        \"id\": 151,\n" +
                "        \"startDate\": \"2018-08-10\",\n" +
                "        \"endDate\": \"2019-05-12\",\n" +
                "        \"currentMatchday\": 24,\n" +
                "        \"winner\": null\n" +
                "    },\n" +
                "    \"teams\": [\n" +
                "        {\n" +
                "            \"id\": 57,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Arsenal FC\",\n" +
                "            \"shortName\": \"Arsenal\",\n" +
                "            \"tla\": \"ARS\",\n" +
                "            \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/en/5/53/Arsenal_FC.svg\",\n" +
                "            \"address\": \"75 Drayton Park London N5 1BU\",\n" +
                "            \"phone\": \"+44 (020) 76195003\",\n" +
                "            \"website\": \"http://www.arsenal.com\",\n" +
                "            \"email\": \"info@arsenal.co.uk\",\n" +
                "            \"founded\": 1886,\n" +
                "            \"clubColors\": \"Red / White\",\n" +
                "            \"venue\": \"Emirates Stadium\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:14Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 61,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Chelsea FC\",\n" +
                "            \"shortName\": \"Chelsea\",\n" +
                "            \"tla\": \"CFC\",\n" +
                "            \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/5/5c/Chelsea_crest.svg\",\n" +
                "            \"address\": \"Fulham Road London SW6 1HS\",\n" +
                "            \"phone\": \"+44 (0871) 9841955\",\n" +
                "            \"website\": \"http://www.chelseafc.com\",\n" +
                "            \"email\": null,\n" +
                "            \"founded\": 1905,\n" +
                "            \"clubColors\": \"Royal Blue / White\",\n" +
                "            \"venue\": \"Stamford Bridge\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:16Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 62,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Everton FC\",\n" +
                "            \"shortName\": \"Everton\",\n" +
                "            \"tla\": \"EVE\",\n" +
                "            \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/f/f9/Everton_FC.svg\",\n" +
                "            \"address\": \"Goodison Park Liverpool L4 4EL\",\n" +
                "            \"phone\": \"+44 (0871) 6631878\",\n" +
                "            \"website\": \"http://www.evertonfc.com\",\n" +
                "            \"email\": \"everton@evertonfc.com\",\n" +
                "            \"founded\": 1878,\n" +
                "            \"clubColors\": \"Blue / White\",\n" +
                "            \"venue\": \"Goodison Park\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:17Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 63,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Fulham FC\",\n" +
                "            \"shortName\": \"Fulham\",\n" +
                "            \"tla\": \"FUL\",\n" +
                "            \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/a/a8/Fulham_fc.svg\",\n" +
                "            \"address\": \"Craven Cottage, Stevenage Road London SW6 6HH\",\n" +
                "            \"phone\": \"+44 (0870) 4421222\",\n" +
                "            \"website\": \"http://www.fulhamfc.com\",\n" +
                "            \"email\": \"enquiries@fulhamfc.com\",\n" +
                "            \"founded\": 1879,\n" +
                "            \"clubColors\": \"White / Black\",\n" +
                "            \"venue\": \"Craven Cottage\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:17Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 64,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Liverpool FC\",\n" +
                "            \"shortName\": \"Liverpool\",\n" +
                "            \"tla\": \"LIV\",\n" +
                "            \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/0/0a/FC_Liverpool.svg\",\n" +
                "            \"address\": \"Anfield Road Liverpool L4 OTH\",\n" +
                "            \"phone\": \"+44 (0844) 4993000\",\n" +
                "            \"website\": \"http://www.liverpoolfc.tv\",\n" +
                "            \"email\": \"customercontact@liverpoolfc.tv\",\n" +
                "            \"founded\": 1892,\n" +
                "            \"clubColors\": \"Red / White\",\n" +
                "            \"venue\": \"Anfield\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:18Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 65,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Manchester City FC\",\n" +
                "            \"shortName\": \"Man City\",\n" +
                "            \"tla\": \"MNC\",\n" +
                "            \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/e/eb/Manchester_City_FC_badge.svg\",\n" +
                "            \"address\": \"SportCity Manchester M11 3FF\",\n" +
                "            \"phone\": \"+44 (0870) 0621894\",\n" +
                "            \"website\": \"https://www.mancity.com\",\n" +
                "            \"email\": \"mancity@mancity.com\",\n" +
                "            \"founded\": 1880,\n" +
                "            \"clubColors\": \"Sky Blue / White\",\n" +
                "            \"venue\": \"Etihad Stadium\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:18Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 66,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Manchester United FC\",\n" +
                "            \"shortName\": \"Man United\",\n" +
                "            \"tla\": \"MNU\",\n" +
                "            \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/d/da/Manchester_United_FC.svg\",\n" +
                "            \"address\": \"Sir Matt Busby Way Manchester M16 0RA\",\n" +
                "            \"phone\": \"+44 (0161) 8688000\",\n" +
                "            \"website\": \"http://www.manutd.com\",\n" +
                "            \"email\": \"enquiries@manutd.co.uk\",\n" +
                "            \"founded\": 1878,\n" +
                "            \"clubColors\": \"Red / White\",\n" +
                "            \"venue\": \"Old Trafford\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:19Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 67,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Newcastle United FC\",\n" +
                "            \"shortName\": \"Newcastle\",\n" +
                "            \"tla\": \"NEW\",\n" +
                "            \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/5/56/Newcastle_United_Logo.svg\",\n" +
                "            \"address\": \"Sports Direct Arena Newcastle upon Tyne NE1 4ST\",\n" +
                "            \"phone\": null,\n" +
                "            \"website\": \"http://www.nufc.co.uk\",\n" +
                "            \"email\": \"admin@nufc.co.uk\",\n" +
                "            \"founded\": 1881,\n" +
                "            \"clubColors\": \"Black / White\",\n" +
                "            \"venue\": \"St. James' Park\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:19Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 73,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Tottenham Hotspur FC\",\n" +
                "            \"shortName\": \"Tottenham\",\n" +
                "            \"tla\": \"TOT\",\n" +
                "            \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/b/b4/Tottenham_Hotspur.svg\",\n" +
                "            \"address\": \"Bill Nicholson Way, 748 High Road London N17 OAP\",\n" +
                "            \"phone\": \"+44 (0844) 4995000\",\n" +
                "            \"website\": \"http://www.tottenhamhotspur.com\",\n" +
                "            \"email\": \"customer.care@tottenhamhotspur.com\",\n" +
                "            \"founded\": 1882,\n" +
                "            \"clubColors\": \"Navy Blue / White\",\n" +
                "            \"venue\": \"Wembley Stadium\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:21Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 76,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Wolverhampton Wanderers FC\",\n" +
                "            \"shortName\": \"Wolverhampton\",\n" +
                "            \"tla\": \"WOL\",\n" +
                "            \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/f/fc/Wolverhampton_Wanderers.svg\",\n" +
                "            \"address\": \"Waterloo Road Wolverhampton WV1 4QR\",\n" +
                "            \"phone\": \"+44 (0871) 2222220\",\n" +
                "            \"website\": \"http://www.wolves.co.uk\",\n" +
                "            \"email\": \"info@wolves.co.uk\",\n" +
                "            \"founded\": 1877,\n" +
                "            \"clubColors\": \"Black / Gold\",\n" +
                "            \"venue\": \"Molineux Stadium\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:23Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 328,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Burnley FC\",\n" +
                "            \"shortName\": \"Burnley\",\n" +
                "            \"tla\": \"BUR\",\n" +
                "            \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/0/02/Burnley_FC_badge.png\",\n" +
                "            \"address\": \"Harry Potts Way Burnley BB10 4BX\",\n" +
                "            \"phone\": \"+44 (0871) 2211882\",\n" +
                "            \"website\": \"http://www.burnleyfootballclub.com\",\n" +
                "            \"email\": \"info@burnleyfc.com\",\n" +
                "            \"founded\": 1881,\n" +
                "            \"clubColors\": \"Claret / Sky Blue\",\n" +
                "            \"venue\": \"Turf Moor\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:44Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 338,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Leicester City FC\",\n" +
                "            \"shortName\": \"Leicester City\",\n" +
                "            \"tla\": \"LEI\",\n" +
                "            \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/en/6/63/Leicester02.png\",\n" +
                "            \"address\": \"The Walkers Stadium, Filbert Way Leicester LE2 7FL\",\n" +
                "            \"phone\": \"+44 (0844) 8156000\",\n" +
                "            \"website\": \"http://www.lcfc.com\",\n" +
                "            \"email\": null,\n" +
                "            \"founded\": 1884,\n" +
                "            \"clubColors\": \"Royal Blue / White\",\n" +
                "            \"venue\": \"King Power Stadium\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:46Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 340,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Southampton FC\",\n" +
                "            \"shortName\": \"Southampton\",\n" +
                "            \"tla\": \"SOT\",\n" +
                "            \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/c/c9/FC_Southampton.svg\",\n" +
                "            \"address\": \"Britannia Road Southampton SO14 5FP\",\n" +
                "            \"phone\": null,\n" +
                "            \"website\": \"http://www.saintsfc.co.uk\",\n" +
                "            \"email\": \"sfc@saintsfc.co.uk\",\n" +
                "            \"founded\": 1885,\n" +
                "            \"clubColors\": \"Red / White / Black\",\n" +
                "            \"venue\": \"St. Mary's Stadium\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:46Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 346,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Watford FC\",\n" +
                "            \"shortName\": \"Watford\",\n" +
                "            \"tla\": \"WAT\",\n" +
                "            \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/e/e2/Watford.svg\",\n" +
                "            \"address\": \"Vicarage Road Watford WD18 0ER\",\n" +
                "            \"phone\": null,\n" +
                "            \"website\": \"http://www.watfordfc.com\",\n" +
                "            \"email\": \"yourvoice@watfordfc.com\",\n" +
                "            \"founded\": 1881,\n" +
                "            \"clubColors\": \"Yellow / Black\",\n" +
                "            \"venue\": \"Vicarage Road Stadium\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:48Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 354,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Crystal Palace FC\",\n" +
                "            \"shortName\": \"Crystal Palace\",\n" +
                "            \"tla\": \"CRY\",\n" +
                "            \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/b/bf/Crystal_Palace_F.C._logo_%282013%29.png\",\n" +
                "            \"address\": \"Whitehorse Lane London SE25 6PU\",\n" +
                "            \"phone\": \"+44 (020) 87686000\",\n" +
                "            \"website\": \"http://www.cpfc.co.uk\",\n" +
                "            \"email\": \"info@cpfc.co.uk\",\n" +
                "            \"founded\": 1905,\n" +
                "            \"clubColors\": \"Red / Blue\",\n" +
                "            \"venue\": \"Selhurst Park\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:50Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 394,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Huddersfield Town AFC\",\n" +
                "            \"shortName\": \"Huddersfield\",\n" +
                "            \"tla\": \"HUD\",\n" +
                "            \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/5/5a/Huddersfield_Town_A.F.C._logo.svg\",\n" +
                "            \"address\": \"Stadium Way Huddersfield HD1 6PX\",\n" +
                "            \"phone\": \"+44 (0148) 4484112\",\n" +
                "            \"website\": \"http://www.htafc.com\",\n" +
                "            \"email\": \"info@htafc.com\",\n" +
                "            \"founded\": 1908,\n" +
                "            \"clubColors\": \"Blue / White\",\n" +
                "            \"venue\": \"The John Smith's Stadium\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:54Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 397,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Brighton & Hove Albion FC\",\n" +
                "            \"shortName\": \"Brighton Hove\",\n" +
                "            \"tla\": \"BHA\",\n" +
                "            \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/f/fd/Brighton_%26_Hove_Albion_logo.svg\",\n" +
                "            \"address\": \"44 North Road Brighton & Hove BN1 1YR\",\n" +
                "            \"phone\": \"+44 (01273) 878288\",\n" +
                "            \"website\": \"http://www.seagulls.co.uk\",\n" +
                "            \"email\": \"seagulls@bhafc.co.uk\",\n" +
                "            \"founded\": 1898,\n" +
                "            \"clubColors\": \"Blue / White\",\n" +
                "            \"venue\": \"The American Express Community Stadium\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:08:54Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 563,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"West Ham United FC\",\n" +
                "            \"shortName\": \"West Ham\",\n" +
                "            \"tla\": \"WHU\",\n" +
                "            \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/de/e/e0/West_Ham_United_FC.svg\",\n" +
                "            \"address\": \"Green Street, Upton Park London E13 9AZ\",\n" +
                "            \"phone\": \"+44 (020) 85482794\",\n" +
                "            \"website\": \"http://www.whufc.com\",\n" +
                "            \"email\": \"yourcomments@westhamunited.co.uk\",\n" +
                "            \"founded\": 1895,\n" +
                "            \"clubColors\": \"Claret / Sky Blue\",\n" +
                "            \"venue\": \"London Stadium\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:09:16Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 715,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2264,\n" +
                "                \"name\": \"Wales\"\n" +
                "            },\n" +
                "            \"name\": \"Cardiff City FC\",\n" +
                "            \"shortName\": \"Cardiff\",\n" +
                "            \"tla\": \"CAR\",\n" +
                "            \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/en/3/3c/Cardiff_City_crest.svg\",\n" +
                "            \"address\": \"Cardiff City Stadium, Leckwith Road Cardiff CF11 8AZ\",\n" +
                "            \"phone\": \"+44 (0845) 3651115\",\n" +
                "            \"website\": \"http://www.cardiffcityfc.co.uk\",\n" +
                "            \"email\": \"club@cardiffcityfc.co.uk\",\n" +
                "            \"founded\": 1899,\n" +
                "            \"clubColors\": \"Blue / White\",\n" +
                "            \"venue\": \"Cardiff City Stadium\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:09:32Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 1044,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"AFC Bournemouth\",\n" +
                "            \"shortName\": \"Bournemouth\",\n" +
                "            \"tla\": \"BOR\",\n" +
                "            \"crestUrl\": \"https://upload.wikimedia.org/wikipedia/de/4/41/Afc_bournemouth.svg\",\n" +
                "            \"address\": \"Dean Court, Kings Park Bournemouth BH7 7AF\",\n" +
                "            \"phone\": \"+44 (01202) 726300\",\n" +
                "            \"website\": \"http://www.afcb.co.uk\",\n" +
                "            \"email\": \"admin@afcb.co.uk\",\n" +
                "            \"founded\": 1890,\n" +
                "            \"clubColors\": \"Red / Black\",\n" +
                "            \"venue\": \"Vitality Stadium\",\n" +
                "            \"lastUpdated\": \"2018-10-15T15:09:47Z\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }
    public static String CompetitionsBackup(){
        return "{\n" +
                "    \"count\": 147,\n" +
                "    \"filters\": {},\n" +
                "    \"competitions\": [\n" +
                "        {\n" +
                "            \"id\": 2006,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2001,\n" +
                "                \"name\": \"Africa\"\n" +
                "            },\n" +
                "            \"name\": \"WC Qualification\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 7,\n" +
                "                \"startDate\": \"2015-10-07\",\n" +
                "                \"endDate\": \"2017-11-14\",\n" +
                "                \"currentMatchday\": 6,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-04T23:54:04Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2023,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2011,\n" +
                "                \"name\": \"Argentina\"\n" +
                "            },\n" +
                "            \"name\": \"Primera B Nacional\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 295,\n" +
                "                \"startDate\": \"2018-08-25\",\n" +
                "                \"endDate\": \"2019-04-20\",\n" +
                "                \"currentMatchday\": 14,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-13T19:00:17Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2024,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2011,\n" +
                "                \"name\": \"Argentina\"\n" +
                "            },\n" +
                "            \"name\": \"Superliga Argentina\",\n" +
                "            \"code\": \"ASL\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_TWO\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 282,\n" +
                "                \"startDate\": \"2018-08-11\",\n" +
                "                \"endDate\": \"2019-04-07\",\n" +
                "                \"currentMatchday\": 16,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-25T00:00:20Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2025,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2011,\n" +
                "                \"name\": \"Argentina\"\n" +
                "            },\n" +
                "            \"name\": \"Supercopa Argentina\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 27,\n" +
                "                \"startDate\": \"2018-03-15\",\n" +
                "                \"endDate\": \"2018-03-15\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": {\n" +
                "                    \"id\": 2069,\n" +
                "                    \"name\": \"CA River Plate\",\n" +
                "                    \"shortName\": \"River Plate\",\n" +
                "                    \"tla\": \"RIV\",\n" +
                "                    \"crestUrl\": null\n" +
                "                }\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-04T23:54:32Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2008,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2015,\n" +
                "                \"name\": \"Australia\"\n" +
                "            },\n" +
                "            \"name\": \"A League\",\n" +
                "            \"code\": \"AAL\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_TWO\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 283,\n" +
                "                \"startDate\": \"2018-10-19\",\n" +
                "                \"endDate\": \"2019-04-28\",\n" +
                "                \"currentMatchday\": 16,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-25T12:29:41Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2026,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2015,\n" +
                "                \"name\": \"Australia\"\n" +
                "            },\n" +
                "            \"name\": \"FFA Cup\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 28,\n" +
                "                \"startDate\": \"2018-02-10\",\n" +
                "                \"endDate\": \"2018-08-29\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": {\n" +
                "                    \"id\": 1833,\n" +
                "                    \"name\": \"Adelaide United FC\",\n" +
                "                    \"shortName\": \"Adelaide Utd\",\n" +
                "                    \"tla\": \"ADE\",\n" +
                "                    \"crestUrl\": null\n" +
                "                }\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-10-30T12:09:45Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2027,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2016,\n" +
                "                \"name\": \"Austria\"\n" +
                "            },\n" +
                "            \"name\": \"ÖFB Cup\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 162,\n" +
                "                \"startDate\": \"2018-07-20\",\n" +
                "                \"endDate\": \"2019-05-31\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-11-01T15:26:04Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2012,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2016,\n" +
                "                \"name\": \"Austria\"\n" +
                "            },\n" +
                "            \"name\": \"Bundesliga\",\n" +
                "            \"code\": \"ABL\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_THREE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 208,\n" +
                "                \"startDate\": \"2018-07-27\",\n" +
                "                \"endDate\": \"2019-03-17\",\n" +
                "                \"currentMatchday\": 19,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-17T21:45:05Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2020,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2016,\n" +
                "                \"name\": \"Austria\"\n" +
                "            },\n" +
                "            \"name\": \"Erste Liga\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 161,\n" +
                "                \"startDate\": \"2018-07-27\",\n" +
                "                \"endDate\": \"2019-06-01\",\n" +
                "                \"currentMatchday\": 16,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-11-25T15:18:43Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2022,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2016,\n" +
                "                \"name\": \"Austria\"\n" +
                "            },\n" +
                "            \"name\": \"Playoffs 1/2\",\n" +
                "            \"code\": \"APL\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_TWO\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 24,\n" +
                "                \"startDate\": \"2018-05-31\",\n" +
                "                \"endDate\": \"2018-06-03\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": {\n" +
                "                    \"id\": 2022,\n" +
                "                    \"name\": \"SKN Sankt Pölten\",\n" +
                "                    \"shortName\": \"St. Pölten\",\n" +
                "                    \"tla\": \"STP\",\n" +
                "                    \"crestUrl\": null\n" +
                "                }\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-08-23T15:47:33Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2028,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2023,\n" +
                "                \"name\": \"Belgium\"\n" +
                "            },\n" +
                "            \"name\": \"Coupe de Belgique\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 166,\n" +
                "                \"startDate\": \"2018-07-29\",\n" +
                "                \"endDate\": \"2019-05-31\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-24T22:37:41Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2032,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2023,\n" +
                "                \"name\": \"Belgium\"\n" +
                "            },\n" +
                "            \"name\": \"Playoffs II\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 34,\n" +
                "                \"startDate\": \"2018-03-31\",\n" +
                "                \"endDate\": \"2018-05-23\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-02T13:08:02Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2033,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2023,\n" +
                "                \"name\": \"Belgium\"\n" +
                "            },\n" +
                "            \"name\": \"Division 1B\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 164,\n" +
                "                \"startDate\": \"2018-08-03\",\n" +
                "                \"endDate\": \"2019-03-01\",\n" +
                "                \"currentMatchday\": 23,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-20T17:52:03Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2009,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2023,\n" +
                "                \"name\": \"Belgium\"\n" +
                "            },\n" +
                "            \"name\": \"Jupiler Pro League\",\n" +
                "            \"code\": \"BJL\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_TWO\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 163,\n" +
                "                \"startDate\": \"2018-07-27\",\n" +
                "                \"endDate\": \"2019-03-17\",\n" +
                "                \"currentMatchday\": 23,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-21T14:35:07Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2010,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2023,\n" +
                "                \"name\": \"Belgium\"\n" +
                "            },\n" +
                "            \"name\": \"Supercoupe de Belgique\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 165,\n" +
                "                \"startDate\": \"2018-07-22\",\n" +
                "                \"endDate\": \"2018-07-22\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-06-04T23:58:10Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2034,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2028,\n" +
                "                \"name\": \"Bolivia\"\n" +
                "            },\n" +
                "            \"name\": \"LFPB\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 427,\n" +
                "                \"startDate\": \"2019-01-20\",\n" +
                "                \"endDate\": \"2019-12-31\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-21T14:45:07Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2035,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2030,\n" +
                "                \"name\": \"Bosnia and Herzegovina\"\n" +
                "            },\n" +
                "            \"name\": \"Premier Liga\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 167,\n" +
                "                \"startDate\": \"2018-07-21\",\n" +
                "                \"endDate\": \"2019-02-09\",\n" +
                "                \"currentMatchday\": 20,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-03T17:20:08Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2036,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2032,\n" +
                "                \"name\": \"Brazil\"\n" +
                "            },\n" +
                "            \"name\": \"Série C\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 38,\n" +
                "                \"startDate\": \"2018-04-14\",\n" +
                "                \"endDate\": \"2018-08-28\",\n" +
                "                \"currentMatchday\": 18,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-09-24T02:30:06Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2029,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2032,\n" +
                "                \"name\": \"Brazil\"\n" +
                "            },\n" +
                "            \"name\": \"Série B\",\n" +
                "            \"code\": \"BSB\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_THREE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 31,\n" +
                "                \"startDate\": \"2018-04-14\",\n" +
                "                \"endDate\": \"2018-11-24\",\n" +
                "                \"currentMatchday\": 38,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-11-25T20:25:17Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2037,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2032,\n" +
                "                \"name\": \"Brazil\"\n" +
                "            },\n" +
                "            \"name\": \"Copa do Brasil\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 39,\n" +
                "                \"startDate\": \"2018-01-30\",\n" +
                "                \"endDate\": \"2018-08-17\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-10-19T23:40:00Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2013,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2032,\n" +
                "                \"name\": \"Brazil\"\n" +
                "            },\n" +
                "            \"name\": \"Série A\",\n" +
                "            \"code\": \"BSA\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_ONE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 15,\n" +
                "                \"startDate\": \"2018-04-14\",\n" +
                "                \"endDate\": \"2018-12-02\",\n" +
                "                \"currentMatchday\": 38,\n" +
                "                \"winner\": {\n" +
                "                    \"id\": 1776,\n" +
                "                    \"name\": \"São Paulo FC\",\n" +
                "                    \"shortName\": \"São Paulo\",\n" +
                "                    \"tla\": \"SAO\",\n" +
                "                    \"crestUrl\": null\n" +
                "                }\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-12-03T22:10:11Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2038,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2032,\n" +
                "                \"name\": \"Brazil\"\n" +
                "            },\n" +
                "            \"name\": \"Série D\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 40,\n" +
                "                \"startDate\": \"2018-04-21\",\n" +
                "                \"endDate\": \"2018-08-04\",\n" +
                "                \"currentMatchday\": 6,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-04T23:59:34Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2040,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2035,\n" +
                "                \"name\": \"Bulgaria\"\n" +
                "            },\n" +
                "            \"name\": \"A PFG\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 168,\n" +
                "                \"startDate\": \"2018-07-20\",\n" +
                "                \"endDate\": \"2019-03-16\",\n" +
                "                \"currentMatchday\": 21,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-17T21:50:05Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2039,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2035,\n" +
                "                \"name\": \"Bulgaria\"\n" +
                "            },\n" +
                "            \"name\": \"Kupa na Bulgarija\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 419,\n" +
                "                \"startDate\": \"2018-09-25\",\n" +
                "                \"endDate\": \"2019-05-31\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-06-05T00:00:10Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2041,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2040,\n" +
                "                \"name\": \"Canada\"\n" +
                "            },\n" +
                "            \"name\": \"Canadian Championship\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 43,\n" +
                "                \"startDate\": \"2018-06-07\",\n" +
                "                \"endDate\": \"2018-08-16\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-05T00:01:12Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2048,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2045,\n" +
                "                \"name\": \"Chile\"\n" +
                "            },\n" +
                "            \"name\": \"Primera División\",\n" +
                "            \"code\": \"CPD\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_THREE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 51,\n" +
                "                \"startDate\": \"2018-02-03\",\n" +
                "                \"endDate\": \"2018-12-01\",\n" +
                "                \"currentMatchday\": 30,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-03T21:15:11Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2042,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2045,\n" +
                "                \"name\": \"Chile\"\n" +
                "            },\n" +
                "            \"name\": \"Playoffs 1/2\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 44,\n" +
                "                \"startDate\": \"2017-11-25\",\n" +
                "                \"endDate\": \"2017-12-21\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-05T00:01:23Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2043,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2045,\n" +
                "                \"name\": \"Chile\"\n" +
                "            },\n" +
                "            \"name\": \"Supercopa de Chile\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 45,\n" +
                "                \"startDate\": \"2018-01-26\",\n" +
                "                \"endDate\": \"2018-01-26\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-06-05T00:01:51Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2044,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2046,\n" +
                "                \"name\": \"China PR\"\n" +
                "            },\n" +
                "            \"name\": \"Chinese Super League\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 46,\n" +
                "                \"startDate\": \"2018-03-02\",\n" +
                "                \"endDate\": \"2018-11-12\",\n" +
                "                \"currentMatchday\": 30,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-11-11T17:31:36Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2045,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2049,\n" +
                "                \"name\": \"Colombia\"\n" +
                "            },\n" +
                "            \"name\": \"Liga Postobón\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 47,\n" +
                "                \"startDate\": \"2018-02-03\",\n" +
                "                \"endDate\": \"2018-11-11\",\n" +
                "                \"currentMatchday\": 19,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-12-17T20:25:07Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2046,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2049,\n" +
                "                \"name\": \"Colombia\"\n" +
                "            },\n" +
                "            \"name\": \"Superliga de Colombia\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 48,\n" +
                "                \"startDate\": \"2018-02-01\",\n" +
                "                \"endDate\": \"2018-02-08\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-06-05T00:02:32Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2047,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2058,\n" +
                "                \"name\": \"Croatia\"\n" +
                "            },\n" +
                "            \"name\": \"Prva Liga\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 170,\n" +
                "                \"startDate\": \"2018-07-27\",\n" +
                "                \"endDate\": \"2019-05-25\",\n" +
                "                \"currentMatchday\": 18,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-17T21:45:05Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2049,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2062,\n" +
                "                \"name\": \"Czech Republic\"\n" +
                "            },\n" +
                "            \"name\": \"Synot Liga\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 171,\n" +
                "                \"startDate\": \"2018-07-20\",\n" +
                "                \"endDate\": \"2019-04-27\",\n" +
                "                \"currentMatchday\": 20,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-18T16:35:01Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2141,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2065,\n" +
                "                \"name\": \"Denmark\"\n" +
                "            },\n" +
                "            \"name\": \"Play Offs 1/2\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": null,\n" +
                "            \"numberOfAvailableSeasons\": 0,\n" +
                "            \"lastUpdated\": \"2018-07-13T13:34:22Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2050,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2065,\n" +
                "                \"name\": \"Denmark\"\n" +
                "            },\n" +
                "            \"name\": \"Superliga\",\n" +
                "            \"code\": \"DSU\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_THREE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 172,\n" +
                "                \"startDate\": \"2018-07-13\",\n" +
                "                \"endDate\": \"2019-03-17\",\n" +
                "                \"currentMatchday\": 21,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-18T16:35:01Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2051,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2065,\n" +
                "                \"name\": \"Denmark\"\n" +
                "            },\n" +
                "            \"name\": \"DBU Pokalen\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 173,\n" +
                "                \"startDate\": \"2018-08-07\",\n" +
                "                \"endDate\": \"2019-05-31\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-12-06T02:05:03Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2052,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2069,\n" +
                "                \"name\": \"Ecuador\"\n" +
                "            },\n" +
                "            \"name\": \"Copa Pilsener Serie A\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 55,\n" +
                "                \"startDate\": \"2018-02-17\",\n" +
                "                \"endDate\": \"2018-12-09\",\n" +
                "                \"currentMatchday\": 22,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 1,\n" +
                "            \"lastUpdated\": \"2018-12-17T21:50:05Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2055,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"FA Cup\",\n" +
                "            \"code\": \"FAC\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_TWO\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 207,\n" +
                "                \"startDate\": \"2018-08-10\",\n" +
                "                \"endDate\": \"2019-05-18\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-25T12:05:08Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2056,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"FA Community Shield\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 60,\n" +
                "                \"startDate\": \"2018-08-05\",\n" +
                "                \"endDate\": \"2018-08-05\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2018-06-05T00:05:10Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2016,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Championship\",\n" +
                "            \"code\": \"ELC\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_ONE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 154,\n" +
                "                \"startDate\": \"2018-08-03\",\n" +
                "                \"endDate\": \"2019-05-05\",\n" +
                "                \"currentMatchday\": 29,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-22T22:30:02Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2139,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Football League Cup\",\n" +
                "            \"code\": \"FLC\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_THREE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 176,\n" +
                "                \"startDate\": \"2018-08-14\",\n" +
                "                \"endDate\": \"2019-02-24\",\n" +
                "                \"currentMatchday\": null,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-25T11:15:00Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2053,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"National League\",\n" +
                "            \"code\": null,\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_FOUR\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 174,\n" +
                "                \"startDate\": \"2018-08-04\",\n" +
                "                \"endDate\": \"2019-04-27\",\n" +
                "                \"currentMatchday\": 31,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 2,\n" +
                "            \"lastUpdated\": \"2019-01-20T18:05:11Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2021,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Premier League\",\n" +
                "            \"code\": \"PL\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_ONE\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 151,\n" +
                "                \"startDate\": \"2018-08-10\",\n" +
                "                \"endDate\": \"2019-05-12\",\n" +
                "                \"currentMatchday\": 24,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 26,\n" +
                "            \"lastUpdated\": \"2019-01-21T12:45:04Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2030,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"League One\",\n" +
                "            \"code\": \"EL1\",\n" +
                "            \"emblemUrl\": null,\n" +
                "            \"plan\": \"TIER_TWO\",\n" +
                "            \"currentSeason\": {\n" +
                "                \"id\": 152,\n" +
                "                \"startDate\": \"2018-08-04\",\n" +
                "                \"endDate\": \"2019-05-04\",\n" +
                "                \"currentMatchday\": 30,\n" +
                "                \"winner\": null\n" +
                "            },\n" +
                "            \"numberOfAvailableSeasons\": 10,\n" +
                "            \"lastUpdated\": \"2019-01-23T12:10:02Z\"\n" +
                "        }]}";
    }


    public static String TeamProfileBackup() {
        return "{\n" +
                "    \"id\": 57,\n" +
                "    \"area\": {\n" +
                "        \"id\": 2072,\n" +
                "        \"name\": \"England\"\n" +
                "    },\n" +
                "    \"activeCompetitions\": [\n" +
                "        {\n" +
                "            \"id\": 2021,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2072,\n" +
                "                \"name\": \"England\"\n" +
                "            },\n" +
                "            \"name\": \"Premier League\",\n" +
                "            \"code\": \"PL\",\n" +
                "            \"plan\": \"TIER_ONE\",\n" +
                "            \"lastUpdated\": \"2019-01-21T12:45:04Z\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2146,\n" +
                "            \"area\": {\n" +
                "                \"id\": 2077,\n" +
                "                \"name\": \"Europe\"\n" +
                "            },\n" +
                "            \"name\": \"UEFA Europa League\",\n" +
                "            \"code\": \"EL\",\n" +
                "            \"plan\": \"TIER_TWO\",\n" +
                "            \"lastUpdated\": \"2018-12-14T22:45:01Z\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"name\": \"Arsenal FC\",\n" +
                "    \"shortName\": \"Arsenal\",\n" +
                "    \"tla\": \"ARS\",\n" +
                "    \"crestUrl\": \"http://upload.wikimedia.org/wikipedia/en/5/53/Arsenal_FC.svg\",\n" +
                "    \"address\": \"75 Drayton Park London N5 1BU\",\n" +
                "    \"phone\": \"+44 (020) 76195003\",\n" +
                "    \"website\": \"http://www.arsenal.com\",\n" +
                "    \"email\": \"info@arsenal.co.uk\",\n" +
                "    \"founded\": 1886,\n" +
                "    \"clubColors\": \"Red / White\",\n" +
                "    \"venue\": \"Emirates Stadium\",\n" +
                "    \"squad\": [\n" +
                "        {\n" +
                "            \"id\": 3141,\n" +
                "            \"name\": \"Emiliano Martínez\",\n" +
                "            \"position\": \"Goalkeeper\",\n" +
                "            \"dateOfBirth\": \"1992-09-02T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Argentina\",\n" +
                "            \"nationality\": \"Argentina\",\n" +
                "            \"shirtNumber\": 26,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 3174,\n" +
                "            \"name\": \"Bernd Leno\",\n" +
                "            \"position\": \"Goalkeeper\",\n" +
                "            \"dateOfBirth\": \"1992-03-04T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Germany\",\n" +
                "            \"nationality\": \"Germany\",\n" +
                "            \"shirtNumber\": 19,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7778,\n" +
                "            \"name\": \"Petr Čech\",\n" +
                "            \"position\": \"Goalkeeper\",\n" +
                "            \"dateOfBirth\": \"1982-05-20T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Czech Republic\",\n" +
                "            \"nationality\": \"Czech Republic\",\n" +
                "            \"shirtNumber\": 1,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 137,\n" +
                "            \"name\": \"Sokratis Papastathopoulos\",\n" +
                "            \"position\": \"Defender\",\n" +
                "            \"dateOfBirth\": \"1988-06-09T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Greece\",\n" +
                "            \"nationality\": \"Greece\",\n" +
                "            \"shirtNumber\": 5,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2026,\n" +
                "            \"name\": \"Stephan Lichtsteiner\",\n" +
                "            \"position\": \"Defender\",\n" +
                "            \"dateOfBirth\": \"1984-01-16T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Switzerland\",\n" +
                "            \"nationality\": \"Switzerland\",\n" +
                "            \"shirtNumber\": 12,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 3358,\n" +
                "            \"name\": \"Laurent Koscielny\",\n" +
                "            \"position\": \"Defender\",\n" +
                "            \"dateOfBirth\": \"1985-09-10T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"France\",\n" +
                "            \"nationality\": \"France\",\n" +
                "            \"shirtNumber\": null,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 4112,\n" +
                "            \"name\": \"Carl Jenkinson\",\n" +
                "            \"position\": \"Defender\",\n" +
                "            \"dateOfBirth\": \"1992-02-08T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"England\",\n" +
                "            \"nationality\": \"England\",\n" +
                "            \"shirtNumber\": null,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7782,\n" +
                "            \"name\": \"Nacho Monreal\",\n" +
                "            \"position\": \"Defender\",\n" +
                "            \"dateOfBirth\": \"1986-02-26T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Spain\",\n" +
                "            \"nationality\": \"Spain\",\n" +
                "            \"shirtNumber\": 18,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7783,\n" +
                "            \"name\": \"Héctor Bellerín\",\n" +
                "            \"position\": \"Defender\",\n" +
                "            \"dateOfBirth\": \"1995-03-19T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Spain\",\n" +
                "            \"nationality\": \"Spain\",\n" +
                "            \"shirtNumber\": 2,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7784,\n" +
                "            \"name\": \"Rob Holding\",\n" +
                "            \"position\": \"Defender\",\n" +
                "            \"dateOfBirth\": \"1995-09-20T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"England\",\n" +
                "            \"nationality\": \"England\",\n" +
                "            \"shirtNumber\": 16,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7785,\n" +
                "            \"name\": \"Shkodran Mustafi\",\n" +
                "            \"position\": \"Defender\",\n" +
                "            \"dateOfBirth\": \"1992-04-17T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Germany\",\n" +
                "            \"nationality\": \"Germany\",\n" +
                "            \"shirtNumber\": 20,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7786,\n" +
                "            \"name\": \"Sead Kolašinac\",\n" +
                "            \"position\": \"Defender\",\n" +
                "            \"dateOfBirth\": \"1993-06-20T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Germany\",\n" +
                "            \"nationality\": \"Bosnia and Herzegovina\",\n" +
                "            \"shirtNumber\": 31,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7789,\n" +
                "            \"name\": \"Konstantinos Mavropanos\",\n" +
                "            \"position\": \"Defender\",\n" +
                "            \"dateOfBirth\": \"1997-12-11T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Greece\",\n" +
                "            \"nationality\": \"Greece\",\n" +
                "            \"shirtNumber\": null,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 33800,\n" +
                "            \"name\": \"Julio Pleguezuelo\",\n" +
                "            \"position\": \"Defender\",\n" +
                "            \"dateOfBirth\": \"1997-01-26T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Spain\",\n" +
                "            \"nationality\": \"Spain\",\n" +
                "            \"shirtNumber\": null,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 98411,\n" +
                "            \"name\": \"Zechariah Medley\",\n" +
                "            \"position\": \"Defender\",\n" +
                "            \"dateOfBirth\": \"2000-07-07T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"England\",\n" +
                "            \"nationality\": \"England\",\n" +
                "            \"shirtNumber\": 47,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 600,\n" +
                "            \"name\": \"Mattéo Guendouzi\",\n" +
                "            \"position\": \"Midfielder\",\n" +
                "            \"dateOfBirth\": \"1999-04-14T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"France\",\n" +
                "            \"nationality\": \"France\",\n" +
                "            \"shirtNumber\": 29,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2260,\n" +
                "            \"name\": \"Lucas Torreira\",\n" +
                "            \"position\": \"Midfielder\",\n" +
                "            \"dateOfBirth\": \"1996-02-11T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Uruguay\",\n" +
                "            \"nationality\": \"Uruguay\",\n" +
                "            \"shirtNumber\": 11,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 3180,\n" +
                "            \"name\": \"Mesut Özil\",\n" +
                "            \"position\": \"Midfielder\",\n" +
                "            \"dateOfBirth\": \"1988-10-15T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Germany\",\n" +
                "            \"nationality\": \"Germany\",\n" +
                "            \"shirtNumber\": 10,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 3392,\n" +
                "            \"name\": \"Alex Iwobi\",\n" +
                "            \"position\": \"Midfielder\",\n" +
                "            \"dateOfBirth\": \"1996-05-03T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Nigeria\",\n" +
                "            \"nationality\": \"Nigeria\",\n" +
                "            \"shirtNumber\": 17,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 3477,\n" +
                "            \"name\": \"Granit Xhaka\",\n" +
                "            \"position\": \"Midfielder\",\n" +
                "            \"dateOfBirth\": \"1992-09-27T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Switzerland\",\n" +
                "            \"nationality\": \"Switzerland\",\n" +
                "            \"shirtNumber\": 34,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 3755,\n" +
                "            \"name\": \"Mohamed El Neny\",\n" +
                "            \"position\": \"Midfielder\",\n" +
                "            \"dateOfBirth\": \"1992-07-11T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Egypt\",\n" +
                "            \"nationality\": \"Egypt\",\n" +
                "            \"shirtNumber\": 4,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7791,\n" +
                "            \"name\": \"Aaron Ramsey\",\n" +
                "            \"position\": \"Midfielder\",\n" +
                "            \"dateOfBirth\": \"1990-12-26T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Wales\",\n" +
                "            \"nationality\": \"Wales\",\n" +
                "            \"shirtNumber\": 8,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7792,\n" +
                "            \"name\": \"Ainsley Maitland-Niles\",\n" +
                "            \"position\": \"Midfielder\",\n" +
                "            \"dateOfBirth\": \"1997-08-29T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"England\",\n" +
                "            \"nationality\": \"England\",\n" +
                "            \"shirtNumber\": 15,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7795,\n" +
                "            \"name\": \"Henrikh Mkhitaryan\",\n" +
                "            \"position\": \"Midfielder\",\n" +
                "            \"dateOfBirth\": \"1989-01-21T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Armenia\",\n" +
                "            \"nationality\": \"Armenia\",\n" +
                "            \"shirtNumber\": 7,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 85570,\n" +
                "            \"name\": \"Emile Smith-Rowe\",\n" +
                "            \"position\": \"Midfielder\",\n" +
                "            \"dateOfBirth\": \"2000-07-28T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"England\",\n" +
                "            \"nationality\": \"England\",\n" +
                "            \"shirtNumber\": 55,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 3328,\n" +
                "            \"name\": \"Danny Welbeck\",\n" +
                "            \"position\": \"Attacker\",\n" +
                "            \"dateOfBirth\": \"1990-11-26T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"England\",\n" +
                "            \"nationality\": \"England\",\n" +
                "            \"shirtNumber\": 23,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7797,\n" +
                "            \"name\": \"Alexandre Lacazette\",\n" +
                "            \"position\": \"Attacker\",\n" +
                "            \"dateOfBirth\": \"1991-05-28T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"France\",\n" +
                "            \"nationality\": \"France\",\n" +
                "            \"shirtNumber\": 9,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7798,\n" +
                "            \"name\": \"Joe Willock\",\n" +
                "            \"position\": \"Attacker\",\n" +
                "            \"dateOfBirth\": \"1999-08-20T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"England\",\n" +
                "            \"nationality\": \"England\",\n" +
                "            \"shirtNumber\": null,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7800,\n" +
                "            \"name\": \"Eddie Nketiah\",\n" +
                "            \"position\": \"Attacker\",\n" +
                "            \"dateOfBirth\": \"1999-05-30T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"England\",\n" +
                "            \"nationality\": \"England\",\n" +
                "            \"shirtNumber\": 49,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 7801,\n" +
                "            \"name\": \"Pierre-Emerick Aubameyang\",\n" +
                "            \"position\": \"Attacker\",\n" +
                "            \"dateOfBirth\": \"1989-06-18T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"France\",\n" +
                "            \"nationality\": \"Gabon\",\n" +
                "            \"shirtNumber\": 14,\n" +
                "            \"role\": \"PLAYER\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 11616,\n" +
                "            \"name\": \"Unai Emery\",\n" +
                "            \"position\": null,\n" +
                "            \"dateOfBirth\": \"1971-11-03T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"Spain\",\n" +
                "            \"nationality\": \"Spain\",\n" +
                "            \"shirtNumber\": null,\n" +
                "            \"role\": \"COACH\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 11617,\n" +
                "            \"name\": \"Steve Bould\",\n" +
                "            \"position\": null,\n" +
                "            \"dateOfBirth\": \"1962-11-16T00:00:00Z\",\n" +
                "            \"countryOfBirth\": \"England\",\n" +
                "            \"nationality\": \"England\",\n" +
                "            \"shirtNumber\": null,\n" +
                "            \"role\": \"ASSISTANT_COACH\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"lastUpdated\": \"2018-10-15T15:08:14Z\"\n" +
                "}";
    }
}
