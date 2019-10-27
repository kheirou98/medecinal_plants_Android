package com.example.acer.finalapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


public class DatabaseInitialisation {

    public DatabaseInitialisation(Context context) {
        SQLiteHelper sqLiteHelper = new SQLiteHelper(context);
        sqLiteHelper.insertData(
                "Absinthe",
                "absinthe",
                "Nom latin:  Artemisia absinthium.",
                "Famille:  Composée.",
                "Type:Plante.",
                "Propriétés :\n" +
                        "L’absinthe est une plante agissant sur l’appétit et sur la digestion. Elle favorise la menstruation en cas de retard ou d’insuffisance. C’est un bon vermifuge connu pour combattre le ténia. L’absinthe aide également à lutter contre la fièvre. Elle peut aussi être utilisée en usage externe sur les plaies ou les piqûres d’insectes.\n",
                "Parties utilisées :\n" +
                        "Les feuilles et les extrémités fleuries.\n",
                " Posologie\n" +
                        "Pour soigner les pathologies internes\n" +
                        "Préparer un vermifuge avec 2 à 3g de poudre de feuille d'absinthe + 2g de poudre de réglisse + 0,50 g d'anisvert. Prendre une fois le matin pendant 5 jours. ouPour soigner les pathologies externes.\n" +
                        "Pour cicatriser une plaie : faire bouillir une poignée de feuilles dans un litre d'eau, laissez refroidir. Laver la plaie ou la piqûre avec la décoction.\n",
                "Précautions d'emploi :\n" +
                        "L'absinthe est connue pour être toxique, elle peut rendre accro si on en prend trop souvent (plus de 2 à 4 semaines). Si les doses sont trop élevées elle peut aussi causer des maux de tête et des étourdissements. Cette plante peut rendre le lait amer lors de l'allaitement. La plante peut également donner des congestions cérébrales, des tempéraments bilieux et sanguins et provoquer une irritation et intestinale.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Acerola",
                "acerola",
                "Nom latin:  Malpighia punicifolia (M. glabra).",
                "Famille:  Malpighiacées.",
                "Type:Fruit.",
                "Propriétés :\n" +
                        "Riche en vitamine C (ou acide ascorbique) (1), l’acérola est utilisé pour lutter contre la fatigue et les maladies de l'hiver (rhume, infections sans gravité). Elle peut aussi être prescrite pour faciliter la prise de poids après un amaigrissement important. Par ailleurs, l’acérola peut stimuler la formation des vaisseaux sanguins, la maturation des globules rouges et le renforcement des cartilages et des os. Enfin, l’acérola contient des doses intéressantes de vitamines A, B1 et B6, de calcium, de fer, de magnésium, de phosphore et de potassium.\n",
                "Parties utilisées :\n" +
                        "Le fruit.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre l'amaigrissement, les refroidissements et la fatigue.\n" +
                        "Poudre du fruit : 1 cuillère à café (ou 500 mg) 1 ou 2 fois par jour chez l''adulte.\n" +
                        "Extrait sec à 25% de vitamine C : 3 à 6 comprimés par jour. \n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "La consommation de vitamine C peut perturber la digestion. La dose maximale de vitamine C est de 1g par jour pour un adulte. Pour les enfants, demandez conseil à votre médecin ou à votre pharmacien.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Acore",
                "acore",
                "Nom latin:  Acorus calamus.",
                "Famille:  Aracées.",
                "Type:Plante.",
                "Propriétés :\n" +
                        "L'acore vrai est apéritif (il stimule l'appétit), digestif et carminatif (permet l'expulsion des gaz des intestins et de l'estomac). Il est utilisé pour lutter contre les troubles gastro-intestinaux tels que les ballonnements, la gastrite (inflammation de la muqueuse de l’estomac), l’entérite (inflammation de l’intestin grêle), les ulcères gastriques et l’atonie digestive (perte de tonus de l’appareil digestif). Il est parfois indiqué en cas de règles insuffisantes, car il favorise la sécrétion d’hormones. En raison de son action diurétique, l’acore vrai est efficace contre la goutte et les oliguries (diminution du volume d’urines). Il agit également contre les fièvres intermittentes, les ganglions au niveau du cou et certaines maladies osseuses.\n",
                "Parties utilisées :\n" +
                        "La racine.\n",
                "Posologie :\n" +
                        "En usage externe.\n" +
                        "Contre les maladies osseuses.\n" +
                        "\n" +
                        "Décoction : Faire macérer pendant 6 heures à froid 20 g pour un litre d’eau puis porter à ébullition. Appliquer en compresses.\n" +
                        "Ou\n" +
                        "Teinture : 20 à 30 g sur un pansement.\n" +
                        "Pour les enfants atteints de rachitisme ou de ganglions au niveau du cou.\n" +
                        "Bain : décoction ou teinture.\n",
                "Précautions d'emploi :\n" +
                        "L’huile essentielle d’acore vrai n’est pas recommandée, car elle contient de la cisisoasarone, une substance qui a des effets cancérigènes. Les racines contiennent également cette substance, mais en quantités infimes. Il convient toutefois de ne pas en faire un usage prolongé. Cette plante est déconseillée aux femmes enceintes ou qui allaitent. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Agastache",
                "agastache",
                "Nom latin:  Agastache foeniculum, Agastache anisata, Agastache anethiodor.",
                "Famille:  Lamiacées.",
                "Type:Plante.",
                "Propriétés :\n" +
                        "L’agastache est surtout utilisée en phytothérapie pour son action anti-inflammatoire, expectorante (elle dégage les voies respiratoires) et antispasmodique (elle prévient les contractions musculaires involontaires). Cette plante est indiquée dans la prise en charge de la fièvre, des rhumes, des angines, des douleurs thoraciques et de la toux. Grâce à son effet sédatif, elle contribue à lutter contre les insomnies. On l’emploie parfois pour améliorer le fonctionnement du cœur. En usage externe, l’agastache permet de soigner les plaies et les brûlures superficielles. Les vertus thérapeutiques de cette plante se doivent au méthylchavicol, une molécule présente dans l’huile essentielle extraite des feuilles et des fleurs.\n",
                "Parties utilisées :\n" +
                        "Les feuilles et les fleurs.\n",
                "Posologie :\n"+
                        "Utilisation interne\n" +
                        "Expectorante et anti-inflammatoire : fièvres, rhumes, angines, toux, douleurs de la poitrine.\n" +
                        "Sédative et antispasmodique : insomnies.\n" +
                        "Cardiaque : faiblesses cardiaques.\n" +
                        "Utilisation externe\n" +
                        "Anti-inflammatoire : brûlures, blessures superficielles.\n" +
                        "Indications thérapeutiques usuelles :\n" +
                        "L'agastache permet de traiter les rhumes, la fièvre, la toux et les douleurs thoraciques associées, ainsi que les angines, les plaies et les brûlures superficielles.\n" +
                        "Autres indications thérapeutiques démontrées :\n" +
                        "Ajouter quelques gouttes d'huile essentielle d'agastache dans l'eau du bain permet d'activer la sudation.\n",
                "Précautions d'emploi :\n" +
                        "Le bacopa est déconseillé pendant la grossesse et l’allaitement. Son usage requiert une prudence particulière chez les personnes qui prennent des neuroleptiques, car il peut augmenter l’effet de ces médicaments.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Ail",
                "ail",
                "Nom latin:  Allium sativum.",
                "Famille:  Liliacées.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Les acides phénols et dérivés soufrés de l'ail lui confèrent diverses vertus. Il soigne les infections digestives et respiratoires (antiseptique), pourrait faire baisser le taux de mauvais cholestérol (1) et diminuer le risque cardiovasculaire (2). L'ail est également connu pour fluidifier le sang, empêchant l'artériosclérose (durcissement et épaississement des artères) et pour dilater les vaisseaux sanguins afin de lutter contre l’hypertension et prévenir l’angine de poitrine. Enfin, une méta-analyse portant sur 18 études épidémiologiques a démontré une diminution de 30 % du risque de cancer colorectal et d’environ 50 % du risque de cancer de l’estomac grâce à une consommation élevée d’ail (3).\n",
                "Parties utilisées :\n" +
                        "Le bulbe.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les vers intestinaux.\n" +
                        "Extrait sec : 100 à 250 mg par jour.\n" +
                        "Contre les infections digestives et respiratoires, les troubles circulatoires artériels et \n" +
                        "l'hyperlipidémie mixte.\n" +
                        "Ail frais: manger 2 gousses d’ail par jour.\n" +
                        "Ou\n" +
                        "Teinture officinale : 20 gouttes 2 fois par jour.\n" +
                        "Ou\n" +
                        "Teinture-mère : 40 à 50 gouttes dans un verre d'eau. A boire 3 fois par jour.\n" +
                        "Ou\n" +
                        "Gélules dosées à 300 mg de poudre sèche ou fraîche : 1 à 3 par jour. \n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n" +
                        "L'ail peut provoquer des brûlures gastriques. Il est donc déconseillé en cas d’inflammation gastrique aiguë ou chronique. Sur la peau, il peut provoquer des nécroses. Il est par ailleurs déconseillé de le prendre simultanément à des médicaments anticoagulants ou pour le diabète car il peut potentialiser leurs effets. Enfin, il est conseillé d’éviter de consommer de l’ail avant une chirurgie pour diminuer le risque de saignements prolongés.\n" +
                        "Demandez conseil à votre médecin ou à votre pharmacien avant toute prise.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées. \n"

        );
        sqLiteHelper.insertData(
                "Ajowan",
                "ajowan",
                "Nom latin:  Trachyspermum ammi.",
                "Famille:  Ombellifères.",
                "Type:Plante.",
                "Propriétés :\n" +
                        "L’ajowan est apprécié pour ses propriétés antibactériennes, antifongiques (il soigne les infections causées par des champignons), anti-inflammatoires, diurétiques (il améliore le fonctionnement de l’appareil urinaire), antalgiques (il apaise les douleurs) et antispasmodiques (il prévient les contractions musculaires involontaires). Il est surtout utilisé dans le traitement de certaines infections (intestinales, urinaires, pulmonaires), des gastro-entérites ou des troubles digestifs tels que la diarrhée. On l’emploie également pour prendre en charge les symptômes du paludisme (malaria), les rhumatismes, l’asthme, la grippe et les affections cutanées (dermatoses).\n",
                "Parties utilisées :\n" +
                        "Les fleurs et les graines.\n",
                "Posologie :\n"+
                        "Usage interne : prendre quelques gouttes d'huile essentielle, mélangées à du miel ou à un sirop sucré, de une à deux fois par jour, jusqu'à l'arrêt des symptômes.\n" +
                        "\n" +
                        "Usage externe : pour les affections dermatologiques, consommer de 2 à 4 gouttes d'huile essentielle, mélangées à une huile végétale ou à un autre corps gras miscible. Appliquer en massage sur les parties lésées. Pour les affections dentaires, imbiber un coton d'un mélange constitué d'1 goutte d'huile essentielle pour 3 gouttes d'huile végétale et l'appliquer sur les gencives lésées. Renouveler l'opération jusqu'à l'amélioration de l'inflammation et la disparition de la douleur.",
                "Précautions d'emploi :\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Alkekenge",
                "alkekenge",
                "Nom latin:  physalis alkelengi solanée.",
                "Famille:  Solanaceae.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "L’alkékenge est utilisée comme diurétique c’est-à-dire qu’elle augmente la production urinaire. Elle serait également efficace pour éliminer l’acide urique et pour faire tomber la fièvre. Cette plante est notamment indiquée pour traiter les rhumatismes liés à la goutte, les lithiases urinaires, les oliguries, l’hydropisie, l’ictère et l’hépatisme.\n",
                "Parties utilisées :\t\n" +
                        "-Les baies, les feuilles et les tiges.\n",
                "Posologie :\n" +
                        "En décoction : faire bouillir 20 à 60 baies d’alkékenge desséchées dans 1 litre d’eau pendant 5 minutes. Laisser infuser pendant 10 minutes. Boire par tasses en 24 heures.\n",
                "Précautions d'emploi :\n" +
                        "L'alkekenge n'est pas recommandée aux femmes enceintes et allaitantes ainsi qu'aux enfants en bas âge.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Aloe Vera",
                "aloevera",
                "Nom latin:  Aloe vera.",
                "Famille:  Liliacées.",
                "Type:Plante.",
                "Propriétés :\n" +
                        "En externe, le gel d’aloès est efficace pour soulager les brûlures, comme le montre une étude thaïlandaise publiée en 2007 (1). Il est aussi réputé pour ses bienfaits antiseptiques, cicatrisants, adoucissants et hydratants. Selon deux essais menés à la fin des années 1990 (2,3), l’aloès pourrait favoriser la guérison de l’herpès génital. Dans la médecine traditionnelle indienne, l’aloès est utilisée pour ses vertus hypoglycémiantes et antidiabétiques. Enfin, le gel de l'aloès est fortement laxatif. Il est cependant peu utilisé dans cette indication à cause des risques que cela comporte: colite, hypokaliémie.\n",
                "Parties utilisées :\n" +
                        "Le suc des feuilles.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "A utiliser sous contrôle médical uniquement.\n" +
                        "En usage externe\n" +
                        "Contre les plaies, les brûlures et les hémorroïdes.\n" +
                        "Préparations dermatologiques dosées à 1% de teinture-mère ou à 2-3% d'extrait hydroglycolique : Appliquer localement 2 ou 3 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "L'aloès est un puissant laxatif qui ne doit pas être utilisé sans l'avis d'un médecin. Sa consommation peut provoquer d'importants effets indésirables : diarrhées, douleurs abdominales, colites, hypokaliémie. L'usage interne d'aloès est formellement interdit aux enfants, aux femmes enceintes ou qui allaitent, chez les personnes atteintes d'urémies, d'insuffisance rénale ou d'une maladie du foie.\n" +
                        "Demandez l'avis d'un médecin avant toute prise orale.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Amandier",
                "amandier",
                "Nom latin:  Amygdalus communis.",
                "Famille:  Rosacée.",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "L’amandier est une plante ayant de multiples vertus. Elle calme la toux mais agit également sur la fièvre qu’il peut faire baisser. Il est émollient et diurétique. La plante a également des propriétés purgatives et peut servir de vermifuge.\n",
                "Parties utilisées :\n" +
                        "Les fleurs, les feuilles et les coques.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre la toux et l’insuffisance hépatique\n" +
                        "Faire infuser 30 grammes de feuilles d’amandier et 15 grammes de fleurs dans 1 litre d’eau bouillante pendant 10 minutes. Boire quatre tasses entre chaque repas pour soigner une toux répétitive. Boire une tasse avant chaque repas pour traiter le foie.\n" +
                        "Ou\n" +
                        "Calmer la toux due à une coqueluche.\n" +
                        "Faire bouillir 2 poignées de coques dans 1 litre d’eau pendant 20 minutes. Boire plusieurs petites tasses pendant la journée.\n",
                "Précautions d'emploi :\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Ananas",
                "ananas",
                "Nom latin:  Ananas sativa / Ananas comosus.",
                "Famille:  Broméliacées.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "L’ananas contient de la bromélaïne, une enzyme qui exerce une action anti-inflammatoire et cicatrisante. Elle contribue à réduire l’acidité gastrique. L’ananas est surtout utilisé dans la prise en charge des troubles digestifs tels que la mauvaise digestion et les flatulences. Il est aussi indiqué dans le traitement des inflammations post-opératoires ou post-traumatiques. Il permet de prévenir l’arthrose et les sinusites. En usage externe, on l’emploie pour traiter les peaux grasses et pour soigner les lésions liées à l’acné. Son fruit possède des vitamines A et C.\n",
                "Parties utilisées :\n" +
                        "Le fruit et la tige.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les problèmes de digestion .\n" +
                        "Gélules : 4 gélules de 500 mg par jour, à prendre avec un verre d’eau.\n" +
                        "Pour réduire les inflammations provoquées par les sciatiques et les contractures musculaires.\n" +
                        "Gélules : 8 gélules par jour (4 prises de 2 gélules).\n" +
                        "Ou\n" +
                        "Poudre : 1 cuillère à café dans 100 ml d’eau. Prendre 3 ou 4 fois par jour. N.B. :\n" +
                        "L’ananas peut aussi être consommé frais, cuit ou sous forme de jus.\n",
                "Précautions d'emploi\n" +
                        "L’ananas est déconseillé chez les enfants de moins de 6 ans qui ont l’estomac sensible (muqueuses irritables). Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Anis Vert",
                "anisvert",
                "Nom latin:  Pimpinella anisum.",
                "Famille:  Apiacées.",
                "Type:Plante.",
                "Propriétés :\n" +
                        "L’anis vert est reconnu pour ses vertus antispasmodiques et carminatives (il facilite l’expulsion des gaz intestinaux). Il est efficace dans le traitement de troubles digestifs divers tels que ballonnements, éructations, flatulences… L’anis vert est aussi réputé pour faciliter l’expectoration en cas de toux. Enfin, il favorise la montée de lait chez les femmes qui viennent d’accoucher.\n",
                "Parties utilisées :\n" +
                        "Les fruits.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre la digestion lente (ballonnements, gaz…) et la toux\n" +
                        "Infusion : 1 sachet dose dans 20 cl d’eau bouillante. Laisser infuser 5 min. 1 tasse après chacun des principaux repas.\n" +
                        "Ou\n" +
                        "Huile essentielle (HE) : sur prescription médicale \n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "L’anis vert ne présenterait aucune toxicité à ce jour. En revanche, il ne faut jamais l’ingérer sous forme d’huile essentielle (HE) pure sans prescription médicale (risque toxique). La plante est contre-indiquée chez l’enfant de moins de 6 ans et chez la femme enceinte ou allaitante. Elle est aussi déconseillée aux personnes allergiques à l’anéthol.\n"

        );
        sqLiteHelper.insertData(
                "Arbousier",
                "arbousier",
                "Nom latin:  Arbutus unedo.\n",
                "Famille:  Ericacées.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "L’arbousier possède des propriétés anti-inflammatoires, diurétiques (il améliore le fonctionnement de l’appareil urinaire) et astringentes (il assèche les tissus et facilite la cicatrisation). Il est utilisé en phytothérapie pour prendre en charge les rhumatismes, l’arthrite, l’hypertension, les inflammations des voies urinaires et l’artériosclérose (épaississement des artères). On l’emploie également pour améliorer la circulation sanguine. En gynécologie, l’arbousier agit efficacement contre les leucorrhées (pertes blanches).\n",
                "Parties utilisées :\n" +
                        "Les feuilles et les racines.\n",
                "Posologie :\n"+
                        "Utilisation interne :\n" +
                        "Tonique digestif et antispasmodique intestinal, l'arbousier est conseillé pour traiter diarrhées et spasmes digestifs. C'est aussi un antiseptique naturel recommandé pour lutter contre les infections urinaires, comme la cystite et l'urétrite. Ses racines antihypertensives sont efficaces pour diminuer l'hypertension artérielle. Propriétés astringentes, diurétiques, purgatives et anti-inflammatoires.\n" +
                        "Utilisation externe :\n" +
                        "Utilisé en gargarisme, l'arbousier soulage les maux de gorge.\n" +
                        "Indications thérapeutiques usuelles\n" +
                        "Spasmes des muscles lisses, infections urinaires, hypertension artérielle, maux de gorge, rhumatismes, diarrhée, artériosclérose.\n" +
                        "Autres indications thérapeutiques démontrées\n" +
                        "Les feuilles de l'arbousier, aux propriétés antioxydantes et anticoagulantes, agissent comme des antiagrégants plaquettaires en inhibant l'action de la thrombine dans la coagulation plasmatique. Leur extrait favorise une relaxation aortique grâce à la présence de tanins, de polyphénols et de catéchine gallate dans sa composition.\n",
                "Précautions d'emploi\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Argan",
                "argan",
                "Nom latin:  Argania spinosa.",
                "Famille:  Sapotacées.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "L'huile d'argan contient des acides gras insaturés qui permettent de lutter contre le mauvais cholestérol, donc contre le développement des maladies cardiovasculaires comme le montre une étude canadienne de 2007 (1). Elle agit également contre l'hypertension artérielle et l'hyperglycémie. Par voie orale, l'huile d'argan soulage les douleurs articulaires. On l'utilise sur la peau contre les boutons d'acné ou de varicelle, et surtout comme hydratant naturel. Très nourrissante, elle prévient le vieillissement cutané. La graine de l'arganier contient des saponines qui sont anti-inflammatoires, analgésiques et hypothermisantes (2).\n",
                "Parties utilisées :Les baies.",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les rhumatismes, les douleurs articulaires, l'hypercholestérolémie\n" +
                        "Huile : boire 2 cuillères à soupe le matin à jeun.\n" +
                        "En usage externe\n" +
                        "Contre l'acné et les boutons de varicelle.\n" +
                        "Huile : une application le soir au coucher.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "L'huile d'argan étant photosensibilisante, ne pas s'exposer au soleil durant le traitement, qu'il soit interne ou externe. Attention : l'huile d'argan ne doit jamais être frite.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Armoise",
                "armoise",
                "Nom latin:  Artemisia vulgaris.",
                "Famille:  Astéracées.",
                "Type:Plante.",
                "Propriétés :\n" +
                        "L’armoise possède des propriétés vermifuge, anti-inflammatoires (1) et hypotensives (2). Elle peut aussi être utilisée (mais plus rarement) en cas de menstruations irrégulières et de troubles digestifs.\n",
                "Parties utilisées :Les sommités fleuries.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les troubles digestifs et les parasites intestinaux.\n" +
                        "Infusion : 1 cuillère à soupe de plante sèche pour 15 à 20 cl d'eau bouillante. Laisser infuser 5 à 10 minutes. Boire 1 ou 2 tasses par jour.\n" +
                        "Ou\n" +
                        "Poudre : 2 à 4g par jour.\n" +
                        "Ou\n" +
                        "Teinture-mère : 30 gouttes dans un verre d'eau, 3 fois par jour.\n" +
                        "Contre les règles douloureuses.\n" +
                        "Infusion : 1 à 2 tasses par jour pendant les 8 à 10 jours qui précèdent les règles.\n" +
                        "Ou\n" +
                        "Vin : 20 g de plante pour 1 litre de vin blanc. Laisser macérer 10 jours. 2 verres (type «ballon») par jour pendant les 8 jours qui précèdent les règles.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "L'armoise commune peut provoquer des allergies cutanées. Demandez conseil à un médecin.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Arnica",
                "arnica",
                "Nom latin:  Arnica montana.",
                "Famille:  Astéracées.",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "L'arnica est la plante anti-ecchymoses par excellence. Elle contient des lactones qui agissent contre l'agrégation plaquettaire et l'inflammation des tissus. Selon une étude américaine publiée en 2010, une préparation contenant 20% d'arnica accélère la guérison des ecchymoses (1).\n",
                "Parties utilisées :La fleur.\n",
                "Posologie :\n" +
                        "En usage externe\n" +
                        "Contre les ecchymoses.\n" +
                        "Compresses : imbiber un linge de teinture-mère (un quart de teinture-mère pour trois quarts d’eau) et appliquer sur la zone atteinte pendant 10 à 15 minutes.\n" +
                        "Ou\n" +
                        "Crème ou gel à base d'extraits : appliquer par massage léger jusqu'à pénétration complète. Renouveler si nécessaire 2 ou 3 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi:\n" +
                        "L'arnica ne doit jamais être employée en usage interne. Elle ne doit pas être utilisée près des yeux et de la bouche, sur les plaies, et chez les enfants de moins de 3 ans. Si un produit contenant de l'arnica à été en contact avec une plaie, la rincer abondamment à l'eau distillée ou oxygénée. En cas d'irritation, arrêter le traitement.\n" +
                        "L'arnica peut provoquer une dermite (réaction cutanée). Tester la préparation à base d'arnica sur une petite surface de peau avant toute utilisation.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Artichaut",
                "artichaut",
                "Nom latin:  Cynara scolymus.",
                "Famille:  Astéracées.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Mauvaise digestion, troubles du foie ou des reins… L'artichaut peut aider à combattre ces troubles parce que ses feuilles contiennent de la cynarine, une substance qui favorise la sécrétion de la bile ! Ces bienfaits ont notamment été démontrés par une étude britannique de 2002, menée auprès de 454 volontaires (1). Par ailleurs, il peut aussi faire baisser légèrement le taux de cholestérol et de triglycérides. Enfin, comme il est riche en sels de potassium, il exerce une action diurétique.\n",
                "Parties utilisées :La feuille.\n",
                "Posologie:\n" +
                        "En usage interne\n" +
                        "Contre les troubles du foie et des reins, l'hypercholestérolémie, les symptômes dyspeptiques.\n" +
                        "Décoction : 30 à 40 g de feuilles séchées pour 1 litre d'eau bouillante. Laisser infuser 10 minutes. 3 tasses par jour 15 à 20 minutes avant les repas.\n" +
                        "Ou\n" +
                        "Extrait hydroalcoolique : 0,5 à 1,5g avant les repas, de préférence sous forme de pilules (3 à 5 par jour) pour masquer l'amertume. Ou Gélules dosées de 50 à 100 mg d'extrait sec : 1 ou 2 gélules, 2 ou 3 fois par jour.\n" +
                        "Ou\n" +
                        "Teinture : 500g de feuilles séchées pour 1 litre d'alcool. Laisser macérer 15 jours. 1 cuillère à café à 2 cuillères à soupe dans un demi-verre d'eau, 3 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi\n" +
                        "L'artichaut ne doit pas être pris en cas de calculs vésiculaires et chez la femme qui allaite car il diminue la lactation.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Asperge",
                "asperge",
                "Nom latin:  Asparagus officinalis.",
                "Famille:  Asparaginée.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "L’asperge est indiquée dans les cas d’insuffisance cardiaque grâce à son action sédative. Elle aide à soigner l’hydropisie, les douleurs rénales et l’ictère. C’est une plante est diurétique. Elle est également connue pour ouvrir l’appétit.\n",
                "Parties utilisées :Les racines.",
                "Posologie :\n" +
                        "Faire bouillir 50 g de racines d’asperge dans 1 litre d’eau pendant 15 min. Boire 3 verres par jour à jeun.\n",
                "Précautions d'emploi :\n" +
                        "Ne pas administrer l’asperge aux personnes nerveuses, car les risques d’insomnie ou d’agitation sont augmentés. Ne pas non plus administrer aux personnes souffrant d’inflammation des voies urinaires.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Avoine",
                "avoine",
                "Nom latin:  Avena sativa.",
                "Famille:  Poacées.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Equilibrant du système nerveux, l’avoine est un très bon stimulant psychique, capable de réguler les troubles du sommeil. Dans la tradition phytothérapique, l’extrait d’avoine est réputé pour son action contre la constipation et pour ses propriétés émollientes, antioxydantes et cicatrisantes pour la peau. Cette plante peut également tenir lieu de stimulant sexuel et soulager les rhumatismes.\n",
                "Parties utilisées : Les grains et les parties aériennes.",
                "Posologie :\n" +
                        "En usage interne:\n" +
                        "Contre l’état nerveux léger, l’insomnie et les rhumatismes :\n" +
                        "Infusion : laisser infuser 3 g d’herbe séchée pour 25 cl d’eau bouillante, 10 min. Filtrer. 3 à 4 tasses par jour dont 1 tasse avant le coucher (contre l’insomnie seulement).\n" +
                        "ou\n" +
                        "Teinture-mère 15 gouttes dans un verre d’eau chaude 5 fois par jour.\n" +
                        "Comme reconstituant :\n" +
                        "Recette : laver 1 litre d’avoine, 8 à 10 fois. Faite bouillir dans 3 litres d’eau jusqu’à réduction des volume de moitié. Laisser décanter. Cuire 5 à 10 min. Ajouter 30 cl de vinaigre de cidre. Sucrer. Manger cette bouillie au petit-déjeuner et en milieu d’après-midi.10 à 15 jours en curatif.\n" +
                        "En usage  externe:\n" +
                        "Contre les démangeaisons\n" +
                        "Compresses : Imbiber un linge d’infusion et appliquer sur la zone atteinte, quelques minutes.\n" +
                        "ou\n" +
                        "Décotion : Laisser infuser 20 g de plante séchée dans 1 litre d’eau. Faire bouillir 3 min. Laisser macérer de 10 à 20 min. Filtrer. Diluer dans l’eau de son bain.\n",
                "Précautions d'emploi :\n" +
                        "Comme toutes les plantes, l’avoine peut s’avérer nocive à doses trop importantes. Respectez toujours les quantités indiquées. Ne pas donner en dessous de 6 ans sans avis médical.\n"

        );
        sqLiteHelper.insertData(
                "Badiane",
                "badiane",
                "Nom latin:  Illicium verum.",
                "Famille:  Illicacées.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Grâce à son huile essentielle riche en anéthol, la badiane est reconnue pour stimuler la digestion et apaiser les spasmes intestinaux. Elle est ainsi recommandée contre les ballonnements, les colites spasmodiques douloureuses, les gastrites, les lenteurs digestives, les éructations et les flatulences. Prise à forte dose, elle peut stimuler le système nerveux central.\n",
                "Parties utilisées :Le fruit.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les troubles digestifs fonctionnels.\n" +
                        "Infusion : 1 cuillère à café de fruits séchés pour 1 tasse d'eau bouillante. Laisser infuser 10 minutes. Boire 2 tasses par jour, avant les repas.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi:\n" +
                        "Attention à ne pas confondre la badiane de Chine avec la badiane du Japon (Illicium religiosum) qui est toxique. Son utilisation est interdite en France mais on peut trouver la plante sur Internet.\n" +
                        "Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Ballote",
                "ballote",
                "Nom latin:  Ballota nigra.",
                "Famille:  Lamiacées.",
                "Type:Plante.",
                "Propriétés :\n" +
                        "Antispasmodique, la ballote est conseillée en cas de quinte de toux. Sédative et anxiolytique, elle peut être utilisée contre l’insomnie légère, l’anxiété et l’irritabilité. Ces bienfaits ont notamment été démontrés en 2000 par des chercheurs de l'Université de Lille II (1). Enfin, la plante peut être recommandée en cas de digestion difficile et de douleurs digestives.\n",
                "Parties utilisées : Les sommités fleuries.",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre l'insomnie nerveuse, l'anxiété, l'irritabilité, les troubles nerveux de la ménopause.\n" +
                        "Infusion : 2,5 à 5g pour respectivement ¼ ou ½ litre d’eau par jour, à prendre en trois fois.\n" +
                        "Contre la toux spasmodique, la coqueluche, les crampes gastro-intestinales, les bourdonnements d'oreilles.\n" +
                        "Infusion : 15g à 30g d'herbe de ballote pour un litre d'eau bouillante. Laisser infuser 10 minutes et boire 3 tasses par jour, avant les repas.\n" +
                        "Ou\n" +
                        "Teinture-mère : 30 gouttes dans un verre d'eau. Boire 3 fois par jour.\n" +
                        "Ou\n" +
                        "Alcoolature stabilisée : pour les enfants à partir de 10 ans, 10 gouttes matin et soir. Pour les adultes, 20 à 40 gouttes matin et soir.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "La ballote contient des labdanes furaniques, substances toxiques pour le foie. Demandez conseil à votre médecin ou à votre pharmacien avant toute prise\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Bambou",
                "bamboe",
                "Nom latin:  Bambusa arundinacea.\n",
                "Famille:  Graminées.\n",
                "Type:Plante.",
                "Propriétés :\n" +
                        "- Le bambou est utilisé en usage interne dans la prise en charge de l’arthrose et la prévention de l’ostéoporose. On l’emploie également pour traiter les verrues et consolider les fractures, les ongles et les cheveux. Ses feuilles sont associées à celles de de la dolomite, du lithotamne, de la prêle et de l’ortie piquante pour combattre la chute des cheveux (alopécie). Le bambou agit efficacement contre les douleurs causées par le syndrome carpien, une atteinte du nerf médian qui entraîne des douleurs au niveau de la main et du bras.\n",
                "Parties utilisées : Les feuilles et le liquide (exsudat) issu des nœuds.",
                "Posologie :\n" +
                        "Utilisation interne :\n" +
                        "Atténue les douleurs osseuses et articulaires. Reminéralise et favorise la reconstruction des cartilages et des tissus.\n" +
                        "Utilisation externe :\n" +
                        "Utilisé pour ses propriétés apaisantes, hydratantes et reminéralisantes. Adoucit et hydrate les peaux sèches et sensibles et régénère les cheveux et ongles cassants ou dévitalisés. Pour ses vertus matifiantes, il est également idéal pour les peaux acnéiques.\n" +
                        "Indications thérapeutiques usuelles :\n" +
                        "Arthrose, rhumatismes, ostéoporose, fractures, ongles et cheveux cassants ou ternes, peaux sèches.\n" +
                        "Autres indications thérapeutiques démontrées :\n" +
                        "Riche en silice et en minéraux, le bambou est indiqué pour tous les maux ostéo-articulaires, notamment les douleurs dorsales et les tendinites. Parce qu'il stimule la synthèse du collagène, il est également conseillé pour freiner les effets du vieillissement et des processus dégénératifs.\n",
                "Précautions d'emploi\n" +
                        "-Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Basilic",
                "basilic",
                "Nom latin: Ocimum basilicum.\n",
                "Famille: Lamiacées.\n",
                "Type:Feuille.",
                "Propriétés :\n" +
                        "Le basilic est un antispasmodique intestinal. On l'utilise donc pour faciliter la digestion et combattre les ballonnements. Ses feuilles sont vermifuges et anti-microbiennes, des propriétés évaluées par des chercheurs turcs en 2010 (1). Enfin, une étude effectuée sur des rats a mis évidence les bienfaits hypoglycémiants d’un extrait de basilic (2).\n",
                "Parties utilisées : Les feuilles et les fleurs.",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre l'indigestion, l'inappétence, les flatulences, les ballonnements\n" +
                        "Infusion : 4 à 6g de feuilles séchées pour 25 cl d'eau bouillante. Filtrer. Laisser infuser 10 minutes. Boire une tasse non sucrée par jour.\n" +
                        "En cas de ballonnements chroniques, boire 2 à 5 tasses par jour entre les repas. Arrêter le traitement au bout de 8 jours, puis le reprendre pendant 1 semaine.\n" +
                        "Contre les inflammations du pharynx\n" +
                        "Gargarismes : faire bouillir pendant 20 minutes 2 cuillères à soupe de feuilles séchées dans 25 cl d'eau. Filtrer et laisser refroidir. Se gargariser de cette décoction 2 ou 3 fois par jour.\n" +
                        "En usage externe\n" +
                        "Contre les plaies et les blessures\n" +
                        "Pommade cicatrisante : 2 ou 3 applications par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "L'huile essentielle extraite de la feuille de basilic ne doit pas être prise de façon prolongée. Elle est contre-indiquée chez la femme enceinte ou qui allaite, chez les nourrissons et les jeunes enfants.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Benoite",
                "benoite",
                "Nom latin: Geum urbanum.\n",
                "Famille: Rosacée.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "La benoîte fait baisser la fièvre et provoque la sueur. Elle est indiquée en cas de tuberculose et hémorragies diverses. Elle tonifie le corps ce qui aide à lutter contre l’asthénie. Elle peut être utilisée en usage externe pour les plaies ou les conjonctivites.\n",
                "Parties utilisées : Les racines.\n",
                "Posologie :\n" +
                        "Usage interne\n" +
                        "Laisser infuser 60 grammes de racines de benoîte dans 1 litre d’eau pendant 10 minutes. Boire un demi-litre par jour entre les repas, pendant quelques jours.\n" +
                        "Usage externe\n" +
                        "Faire une décoction de 30 grammes par litre d’eau. Appliquer avec des compresses.\n",
                "Précautions d'emploi\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Blé",
                "ble",
                "Nom latin : Triticum vulgare.\n",
                "Famille : Poacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Le blé a une propriété nutritive, stimulante et tonique (il facilite le transit intestinal et le \n" +
                        "fonctionnement de l’appareil digestif). Il prévient les troubles nerveux, réduit le taux de cholestérol et permet de mieux résister à la fatigue. Il est indiqué dans le traitement de la constipation, des douleurs abdominales et de l’artériosclérose (épaississement des parois des artères provoqué par des dépôts de graisses). Grâce à son action antioxydante, il ralentit le vieillissement de la peau. Le blé est aussi recommandé aux personnes qui souffrent d’anémie, de rachitisme, de déminéralisation osseuse ou de troubles de la prostate. En usage externe, on l’emploie pour soigner les plaies, les panaris et plusieurs affections cutanées (eczéma, psoriasis). Il est aussi conseillé aux femmes enceintes ou qui allaitent.\n",
                "Parties utilisées :\n" +
                        "Les grains, les germes, le son, la farine, l’huile des germes.\n",
                "Posologie :\n" +
                        "- En usage interne : Pour combattre la fatigue. Capsules : Prendre 2 capsules de germes de blé et de carotte deux fois par jour (petit-déjeuner et dîner) pendant 20 jours par mois. Durée totale de la cure : 6 mois. \n" +
                        "- Pour combattre l’artériosclérose. Capsules : Prendre 2 capsules de germes de blé, 2 gélules d’acérola et 2 gélules d’éleuthérocoque deux fois par jour (petit-déjeuner et dîner) pendant 20 jours par mois. Durée totale de la cure : 6 mois. \n" +
                        " - Pour les femmes qui allaitent. Verser 1 cuillère à soupe de germes de blé dans l’alimentation, deux fois par jour. En usage externe Pour traiter les cicatrices et les lésions cutanées. Capsules : Prendre 2 capsules de germes de blé, 2 gélules d’acérola et 2 gélules d’onagre deux fois par jour (avant le déjeuner et le dîner), 3 semaines par mois. Durée totale de la cure : 3 mois. Pour traiter les coups de soleil. Massage : Appliquer de l’huile de germes de blé et de l’huile de millepertuis sur le corps après une exposition prolongée au soleil. \n" +
                        "- Pour soulager les démangeaisons. Massage : Mélanger les huiles de germes de blé (50 ml), de calendula (50 ml), d’arbre à thé (50 gouttes), de lavande (50 gouttes) et de camomille (10 gouttes). Appliquer sur les zones affectées après la douche, 1 ou 2 fois par jour.\n",
                "Précautions d'emploi :\n" +
                        "- Le blé est contre-indiqué chez les personnes allergiques au blé et au gluten. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Bleuet",
                "bleuet",
                "Nom latin: Centaurea cyanus\n",
                "Famille : Astéracées\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Le bleuet possède des propriétés anti-inflammatoires connues en médecine traditionnelle et validées par une étude belge de 1999 (1). Il est utilisé sur les yeux pour traiter les conjonctivites, les orgelets, les irritations et les paupières congestionnées. Enfin, il pourrait favoriser l’élimination des urines.\n",
                "Parties utilisées :\n" +
                        "Les sommités fleuries.\n",
                "Posologie :\n" +
                        "En usage externe\n" +
                        "Contre les conjonctivites\n" +
                        "Décoction : faire bouillir 5g de fleurs séchées dans 100 cc d’eau pendant 10 minutes. Filtrer et laisser refroidir. Réaliser un bain d’yeux immédiat avec une œillère, au moins trois fois par jour.\n" +
                        "Contre les orgelets\n" +
                        "Infusion : mettre 50 g de fleurs séchées dans un litre d'eau bouillante et laisser infuser 20 minutes avant de filtrer à travers une gaze. Laisser refroidir puis utiliser un bain d'œil avec une œillère pendant deux ou trois minutes.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",

                "Précautions d'emploi :\n" +
                        "La plante n’a pas de risque particulier à condition de respecter les dosages recommandés. En cas de doute, demandez conseil à un médecin.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Boldo",
                "boldo",
                "Nom latin : Peumus boldus\n",
                "Famille : Monimiacées\n",
                "Type:Feuille.",
                "Propriétés :\n" +
                        "Le boldo est recommandé pour améliorer la digestion. On l’utilise ainsi en cas de dyspepsies (inconfort intestinal sans raison organique), de calculs biliaires et de constipation passagère. Des chercheurs chiliens ont aussi démontré son efficacité sur les troubles hépato-biliaires sur des animaux (1). Enfin, selon étude clinique menée auprès de 12 sujets, il favoriserait la décontraction des muscles intestinaux (2).\n",
                "Parties utilisées :\n" +
                        "Les feuilles et l'écorce.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les dyspepsies\n" +
                        "Infusion : un sachet-dose pour 20 cl d'eau bouillante. Laisser infuser 5 à 10 minutes. 1 à 3 sachets par jour, à prendre avant les repas, pendant 4 semaines maximum.\n" +
                        "Ou\n" +
                        "Gélules de poudre ou d'extrait sec : 1 gélule, 2 ou 3 fois par jour.\n" +
                        "Ou\n" +
                        "Extrait fluide : 1 cuillère à café diluée dans un peu d'eau le matin à jeun et le soir au coucher.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Le boldo est contre-indiqué en cas d’obstruction des voies biliaires, d’allergie à la plante, de grossesse, d’allaitement et chez les personnes de moins de 18 ans. En cas de maladie du foie, demandez conseil à un médecin avant de l’utiliser.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Bourdaine",
                "bourdaine",
                "Nom latin: \n" +
                        "Rhamnus frangula.\n",
                "Famille: Rhamnacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "La bourdaine possède des dérivés anthracéniques ce qui lui confère de puissantes propriétés laxatives et purgatives. Irritante, elle est préconisée par l’OMS comme traitement ponctuel des constipations occasionnelles.\n",
                "Parties utilisées:\n" +
                        "L'écorce.\n",
                "Posologie :\n" +
                        "La dose habituelle est de 10mg de dérivés anthracéniques par jour, avec un maximum de 30g par jour.\n" +
                        "Pour une posologie adaptée et sans risque, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "La bourdaine ne doit être consommée que sur prescription médicale. Elle est contre-indiquée en cas de grossesse, d'allaitement, de maladies inflammatoires du côlon, de constipation ou de douleurs abdominales d’origine inconnue ou causées par une obstruction du tube digestif, de déshydratation importante et chez les enfants de moins de 15 ans. Elle ne doit jamais être prise durant plus de 8 à 10 jours.\n" +
                        "Attention : cette plante entre en interaction avec certains médicaments (par exemple à base de digoxine) et entraîne des effets indésirables graves (troubles cardiaques).\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Bruyère",
                "bruyere",
                "Nom latin: \n" +
                        "Calluna vulgaris\n",
                "Famille: Éricacées\n",
                "Type:Fleur.",
                "La bruyère était autrefois considérée comme une plante magique et d'augure, ayant des vertus protectrices. Aujourd'hui, elle est reconnue pour ses propriétés diurétiques, son effet antiseptique urogénital et son action dépurative. Elle permet également de soigner les rhumatismes et les engelures.",
                "Parties utilisées :\n" +
                        "Les sommités fleuries.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les inflammations aiguës ou chroniques de l'appareil urinaire\n" +
                        "Infusion : 50g de plante séchée pour 1 litre d'eau bouillante. A boire en 4 fois dans la journée, de préférence après les repas.\n" +
                        "Ou\n" +
                        "Teinture-mère : 40 gouttes dans 20 cl d'eau ou d'infusion, 4 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi\n" +
                        "L'usage de la bruyère n'entraîne aucun risque connu à ce jour aux doses recommandées.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Buchu",
                "buchu",
                "Nom latin: \n" +
                        "Agathosma betulina, Barosma betulina.\n",
                "Famille: \n" +
                        "Rutacées\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Originaire d’Afrique du Sud, le buchu est un arbuste apprécié en phytothérapie pour ses feuilles. Elles ont des propriétés diurétiques (elles améliorent le fonctionnement de l’appareil urinaire) et antiseptiques (elles luttent contre les infections de la peau et des muqueuses). Le buchu est indiqué dans la prise en charge des troubles urinaires comme les inflammations de la vessie (cystite), de la prostate (prostatite) et de l’urètre (urétrite). Grâce à son action antiseptique, elle permet aussi de soigner les bronchites chroniques. Il est fréquent de l’associer à d’autres plantes connues pour leur action diurétique, notamment le boldo et la busserole.\n",
                "Parties utilisées :\n" +
                        "Les feuilles.\n",
                "Posologie :\n" +
                        "En usage interne \n" +
                        "Contre les cystites. \n" +
                        "Infusion : Introduire 1 sachet-dose dans 1 tasse d’eau bouillante. \n" +
                        "Boire 1 à 3 tasses par jour, juste avant les repas. \n" +
                        "Ou \n" +
                        "Teinture : Entre 50 et 100 gouttes par jour, à diluer dans un verre d’eau. \n" +
                        "Boire 2 à 3 verres par jour, juste avant les repas. \n" +
                        "Ou \n" +
                        "Gélules : 2 ou 3 par jour avec un verre d’eau, juste avant les repas.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "L’huile essentielle de buchu peut entraîner des irritations et une carence en potassium. Pendant le traitement, il est conseillé de consommer des fruits et des légumes riches en potassium (abricot, artichaut, brocoli).\n"

        );
        sqLiteHelper.insertData(
                "Busserole",
                "busserole",
                "Nom latin: \n" +
                        "Arctostaphylos uva-ursi.\n",
                "Famille: \n" +
                        "Ericacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Désinfectante des voies urinaires et anti-bactérienne, la busserole est indiquée dans le traitement des infections urinaires (cystite, urétrite). Il a été démontré que l'arbutine, actif sécrété par la busserole, tuait des bactéries de l'urine telles que Escherichia coli et Staphylococcus aureus. La plante possède aussi des bienfaits cicatrisants. Enfin, une étude menée sur des rats a démontré que la busserole pouvait avoir une action diurétique(1).\n",
                "Parties utilisées :\n" +
                        "Les feuilles.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les infections urinaires\n" +
                        "Infusion : 3g de feuilles séchées pulvérisées pour 1 tasse d’eau bouillante. Infuser 10 min, filtrer et boire 3 à 4 tasses par jour.\n" +
                        "Ou\n" +
                        "Teinture-mère : 20 gouttes dans un verre d’eau, 3 fois par jour.\n" +
                        "Ou\n" +
                        "Gélules dosées à 100-200 mg d’extrait sec : 1 ou 2 gélules 3 fois par jour au moment des repas.\n" +
                        "Attention : La durée du traitement ne doit pas dépasser 1 semaine et il faut éviter de faire plus de 5 cures par an.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "La busserole est contre-indiquée chez la femme enceinte ou allaitante, et chez les enfants de moins de 12 ans. La plante peut provoquer des nausées chez certaines personnes.\n" +
                        "\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Cacao",
                "cacao",
                "Nom latin: \n" +
                        "Theobroma cacao.\n",
                "Famille: \n" +
                        "Sterculiacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Le cacao contient des polyphénols, des antioxydants naturels qui ralentissent le vieillissement cellulaire. Ces molécules contribuent à lutter contre l’obésité et les maladies cardiovasculaires en réduisant le taux de mauvais cholestérol. Le cacao est aussi apprécié pour sa valeur nutritionnelle, son effet tonique (il stimule l’organisme et favorise le transit intestinal) et sa capacité à renforcer le système immunitaire. Actuellement, il est indiqué chez les personnes qui doivent suivre un régime alimentaire spécifique et dans la prévention des troubles cardiovasculaires. Il est parfois conseillé pour combattre le stress, l’angoisse et la fatigue. Il pourrait bientôt être également recommandé aux personnes atteintes d’un cancer ou de troubles hématologiques, car des études récentes ont révélé de nouvelles propriétés intéressantes. En usage externe, le cacao peut être appliqué sur les lèvres gercées et les peaux irritées.\n",
                "Parties utilisées :\n" +
                        "Les fèves.\n",
                "Posologie :\n" +
                        "En usage externe \n" +
                        "Contre les lèvres gercées et les peaux irritées. \n" +
                        "Beurre de cacao : Entre 4 et 5 applications par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Le cacao est susceptible d’entraîner chez certaines personnes des maux de tête, une constipation ou des réactions allergiques\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Café Vert",
                "cafevert",
                "Nom latin: \n" +
                        "Coffea arabica , Coffea canephora.\n",
                "Famille: \n" +
                        "Rubiacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés:\n" +
                        "- Le café vert contient de la caféine, un composé organique qui stimule le cerveau et le système nerveux central. Il exerce aussi une action dynamisante (il augmente l’endurance et réduit la sensation de fatigue), diurétique (il facilite l’élimination des graisses et l’absorption du sucre) et détoxifiante (il aide l'organisme à éliminer les toxines et autres déchets de l’appareil digestif et du foie). Le café vert est utilisé en usage interne pour traiter la fatigue, l’obésité et les troubles gastro-intestinaux. Son effet détoxifiant se doit à la présence de cafestol et de kahweol, deux molécules liposolubles qui activent une enzyme appelée Glutathion-S-Transférase (GSQT). Certaines personnes emploient aussi le café vert pour ralentir le vieillissement des cellules.\n",
                "Parties utilisées :\n" +
                        "- La fève (graine).\n",
                "Posologie :\n" +
                        "- Le café vert à fortes doses est déconseillé, particulièrement pendant la grossesse et l’allaitement. Une consommation excessive peut provoquer une excitation et des problèmes cardiovasculaires. Il est contre-indiqué chez les enfants. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n",
                "Précautions d'emploi :\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Calement",
                "calement",
                "Nom latin: \n" +
                        "Calamintha officinalis.\n",
                "Famille: \n" +
                        "Labiée.\n",
                "Type:Plante.",
                "Propriétés :\n" +
                        "- Le calament aide la digestion et empêche les douleurs gastriques. Cette plante est utilisée pour soulager le hoquet.\n",
                "Parties utilisées :\n" +
                        "- La plante entière.\n",
                "Posologie :\n" +
                        "- Faire infuser une cuillère à café de la plante dans une tasse d’eau chaude pendant 10 minutes. Boire une tasse par repas.\n",
                "Précautions d'emploi :\n" +
                        "- Cette plante est interdite aux femmes enceintes ou allaitantes.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées, demander conseil à son médecin.\n"

        );
        sqLiteHelper.insertData(
                "Calendula",
                "calendula",
                "Nom latin: \n" +
                        "Calendula officinalis.\n",
                "Famille: \n" +
                        "Astéracées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "- Le calendula contient des composés triterpéniques, des molécules appréciées pour leur action anti-inflammatoire, cicatrisante et antiseptique (elles soignent les plaies et préviennent les infections cutanées, en particulier celles provoquées par le staphylocoque doré). Il est employé pour traiter les affections de la peau et des muqueuses, les brûlures légères, les plaies superficielles, les démangeaisons, les piqûres d’insectes et les coups de soleil. Le calendula est surtout commercialisé sous forme de crème, de pommade ou de teinture. Il peut aussi être administré sous forme de bain de bouche dans le traitement des gingivites (inflammations des gencives). Ses bienfaits sont reconnus par l’OMS et l’Agence européenne du médicament.\n",
                "Parties utilisées :\n" +
                        "- Les fleurs (pétales). Les pétales sont récoltés, séchés et broyés avant d’entrer dans la composition de produits cosmétiques.\n",
                "Posologie :\n" +
                        "- En usage externe \n" +
                        "-Contre les affections de la peau. \n" +
                        "Infusion : Faire bouillir 1 à 2 g de poudre pour 150 ml d’eau. Laisser infuser 10 minutes. Appliquer une compresse imbibée sur les zones atteintes entre 30 et 60 minutes. \n" +
                        "Contre les affections de la bouche. \n" +
                        "-Gargarisme : Faire bouillir 1 à 2 g de poudre pour 150 ml d’eau. Laisser infuser 10 minutes.\n" +
                        "Prendre sous forme de bain de bouche 2 ou 3 fois par jour. \n" +
                        "- Contre les démangeaisons \n" +
                        "Massage : Mélanger 50 ml d’huile végétale de calendula et de germes de blé avec 50 gouttes d’huile essentielle de camomille romaine, de lavande et d’arbre à thé. Appliquer sur les zones affectées après la douche, 1 ou 2 fois par jour.\n",
                "Précautions d'emploi :\n" +
                        "L’usage de calendula est déconseillé chez les enfants de moins de 12 ans en cas d’affection cutanée, de moins de 6 ans en cas d’affection de la bouche.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Camomille Romaine",
                "camomilleromaine",
                "Nom latin: Chamaemelum nobile (Anthemis nobilis).",
                "Famille: Astéracées",
                "Type:Fleur.",
                "Camomille romaine : Propriétés\n" +
                        "La camomille romaine contient des polyphénols qui la rendent anti-inflammatoire, antispasmodique et digestive. On la prend aussi pour ouvrir l'appétit et comme tonique amer.",
                "Camomille romaine : Parties utilisées\n" +
                        "Les fleurs et les capitules.",
                "Camomille romaine : Posologie\n" +
                        "En usage interne\n" +
                        "Contre les troubles digestifs\n" +
                        "Infusion : 1 sachet-dose pour une tasse d'eau bouillante. Laisser infuser 10 minutes. Boire 1 tasse après chacun des principaux repas.\n" +
                        "Ou\n" +
                        "Extrait-sec : 1 gélule le matin, midi et soir avec un grand verre d'eau, avant les repas.\n" +
                        "En usage externe\n" +
                        "Contre les irritations oculaires\n" +
                        "Collyre : 1 ou 2 gouttes dans l'œil irrité, 2 ou 3 fois par jour.\n" +
                        "Contre le mal de gorge\n" +
                        "Collutoire : 1 pulvérisation dans le fond de la gorge, 2 ou 3 fois par jour.\n" +
                        "Contre la rhinite et la sinusite maxillaire\n" +
                        "Inhalations : 2 ou 3 fois par jour avec de l'infusion (indications ci-dessus).\n" +
                        "En cas de persistance des symptômes, consultez un médecin.",
                "Camomille romaine : Précautions d'emploi\n" +
                        "L’huile essentielle de camomille romaine est déconseillée pendant les 3 premiers mois de la grossesse. L’infusion trop concentrée de camomille romaine peut être vomitive.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées."

        );
        sqLiteHelper.insertData(
                "Canneberge",
                "canneberge",
                "Nom latin: \n" +
                        "Vaccinium macrocarpon\n",
                "Famille: \n" +
                        "Ericacées\n",
                "Type:Fruit/Légume.",
                "Propriétés:\n" +
                        "La canneberge possède un effet bactéricide qui aide à prévenir et à combattre les infections urinaires. Ce bienfait a notamment été démontré par des chercheurs canadiens qui ont testé la plante sur 150 femmes durant un an (1). D’autres études indiquent que la consommation régulière de jus de canneberge pourrait prévenir les infections par Helicobacter pylori à l’estomac (ulcères gastriques, duodénaux) (2,3). La plante contient par ailleurs des substances qui la rendent fortement antioxydante (4). Elle serait bénéfique contre l’athérosclérose, une accumulation de graisses dans les artères (5), le cholestérol (6), l’hypertension (6) et le cancer notamment du sein, du colon, de la prostate et du poumon (7). Enfin, elle peut aider à lutter contre la plaque dentaire et les caries (2).\n",
                "Parties utilisées :\n" +
                        "Les fruits.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les infections urinaires à répétition et pour la prévention de la plaque dentaire et des caries.\n" +
                        "Jus, souvent dilué et édulcoré (30% de jus de fruits, 70% d'eau) : 50 cl à 1 litre par jour. Il est conseillé de boire en plus au moins un litre et demi d’eau dans la journée.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "La canneberge est déconseillée aux personnes prédisposées aux calculs urinaires et aux enfants de moins de 3 ans. En cas de grossesse ou d’allaitement, demandez conseil à un médecin.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Cannelle",
                "cannelle",
                "Nom latin: \n" +
                        "Cinnamomum zeylanicum (cannelier de Ceylan), Cinnamomum aromaticum (cannelier de Chine)\n",
                "Famille: \n" +
                        "Lauracées\n",
                "Type:Fruit/Légume.",
                "Propriétés:\n" +
                        "Tonique antispasmodique et carminative (expulsion des gaz), la cannelle favorise le processus complet de digestion. Elle peut être aussi prescrite en cas de fatigue légère et de perte d’appétit. Enfin, elle dispose d’un fort pouvoir antioxydant (1).\n",
                "Parties utilisées:\n" +
                        "L'écorce et les feuilles.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les gastrites, les troubles de la digestion, la perte d'appétit et la fatigue légère.\n" +
                        "Infusion : 1g d'écorce de cannelier de Chine ou 2 à 4g de cannelier de Ceylan pour une tasse d'eau bouillante. Laisser infuser 10 minutes. Boire 3 ou 4 tasses par jour.\n" +
                        "Ou\n" +
                        "Poudre : 0,3 à 1,5g par jour.\n" +
                        "Ou\n" +
                        "Extrait fluide : 0,5 à 1 ml dans un verre d'eau, 3 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "L'emploi d'huile essentielle de cannelle est contre-indiqué chez la femme enceinte ou allaitante, chez l’enfant de moins de 6 ans et en cas d’ulcères (gastrique ou intestinal). Elle ne doit jamais être appliquée pure sur la peau (risque d’allergie de contact).\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Capucine",
                "capucine",
                "Nom latin: \n" +
                        "Tropaeolum majus\n",
                "Famille: \n" +
                        "Tropéolée\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Grâce à son effet stimulant et topique, la capucine aide le cuir chevelu à prévenir d’une perte excessive de cheveux comme la calvitie précoce. Ses vertus expectorantes soulagent les bronchites et la tuberculose. Cette plante favorise l’apparition des règles.\n",
                "Parties utilisées : \n" +
                        "\n" +
                        "- plante entière, feuilles, semence.\n",
                "Posologie :\n" +
                        "- En usage interne\n" +
                        "Infuser une demi cuillère à café de feuilles de capucine dans une tasse d’eau chaude pendant 10 minutes. Boire 2 à 3 tasses par jour.\n",
                "Précautions d'emploi :\n" +
                        "- Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées, demander conseil à son médecin.\n"

        );
        sqLiteHelper.insertData(
                "Carotte",
                "carotte",
                "Nom latin: \n" +
                        "Daucus carota\n",
                "Famille: \n" +
                        "Apiacées\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "- La carotte est utilisée pour traiter la diarrhée ainsi que l’insuffisance hépatique et rénale. Elle \n" +
                        "renforce les défenses immunitaires et contribue à réduire le taux de cholestérol. Elle contient du carotène (provitamine A), un pigment qui agit efficacement contre certaines maladies de la\n" +
                        " peau (acné, eczéma, couperose), les aphtes et les taches de vieillesse. La carotte est parfois recommandée avant une exposition au soleil. Une alimentation riche en carottes est conseillée pour lutter contre les cystites (inflammations de la vessie), les fissures anales et les parasitoses (maladies provoquées par des parasites).\n",
                "Parties utilisées :\n" +
                        "- Le jus frais, l’huile essentielle et le macérat huileux.\n",
                "Posologie :\n" +
                        "- En usage interne \n" +
                        "Pour renforcer les défenses immunitaires en cas de cancer. \n" +
                        "Capsules : Prendre 2 capsules de carotte (provitamine A) et 2 capsules de germes de blé (vitamine E) 2 fois par jour, avant le petit-déjeuner et avant le dîner. Suivre le traitement 20 jours par mois pendant plusieurs mois. \n" +
                        "Pour les poussées dentaires chez les enfants \n" +
                        "Purée de carottes, accompagnée d’un mélange de jus de myrtille et d’eau de source.\n",
                "Précautions d'emploi :\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Caroubier",
                "caroubier",
                "Nom latin: \n" +
                        "Ceratonia siliqua\n",
                "Famille: \n" +
                        "Césalpiniacées\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Les graines de caroubier contiennent un mucilage et une gomme qui en font un bon épaississant pour soigner les troubles digestifs tels que les diarrhées et les vomissements. En diététique, la plante peut être utilisée comme coupe-faim.\n",
                "Parties utilisées :\n" +
                        "Le fruit et les graines.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre la diarrhée\n" +
                        "Farine de caroube : 20 à 30 g par jour dans de l'eau ou du lait tiède pour les adultes. Pour ne pas irriter le pharynx, ajouter 15% d'amidon à ce mélange. Pour les nourrissons : ajouter 1% de farine.\n" +
                        "Contre les vomissements\n" +
                        "Gomme de caroube : 1 cuillère à soupe dans un verre d'eau pour les adultes. A boire le soir. Pour les nourrissons, 1g de gomme de caroube pour 10 cl de lait, à chaque biberon.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Le caroubier ne présente aucune toxicité connue à ce jour, aux doses recommandées. Un surdosage peut entrainer des troubles intestinaux tels qu'une occlusion.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Cascara",
                "cascara",
                "Nom latin: \n" +
                        "Rhamnus purshiana.\n",
                "Famille: \n" +
                        "Rhamnacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Appréciée pour ses propriétés laxatives et purgatives, l’écorce de cascara est utilisée pour lutter contre la constipation occasionnelle. Son effet laxatif se doit à la présence de cascarosides, des principes actifs qui favorisent l’absorption de l’eau et le transit intestinal. Le cascara peut être associé avec d’autres médicaments, notamment la digoxine (pour traiter les troubles cardiaques) et les diurétiques (en cas d’insuffisance rénale). Cette plante agit également contre le diabète et sert parfois à nettoyer les plaies.\n",
                "Parties utilisées :\n" +
                        "L’écorce.\n",
                "Posologie :\n" +
                        "En usage interne : La dose recommandée est de 250 mg de cascaroside A par jour.\n" +
                        "Demander conseil à un pharmacien spécialisé.\n",
                "Précautions d'emploi :\n" +
                        "En raison de sa toxicité et des possibles effets secondaires (diarrhées, douleurs abdominales), l’écorce de cascara ne peut être utilisée que sur prescription médicale. Afin de réduire ces risques, les médicaments à base de cascara sont préférés aux préparations en vrac. La durée du traitement ne doit pas excéder 10 jours. Si les symptômes persistent au bout de 4 jours, consulter un médecin pour instaurer un traitement plus efficace. Le cascara est contre-indiqué chez les enfants de moins de 10 ans et déconseillé chez les moins de 15 ans. Il ne doit pas être administré aux femmes enceintes ou qui allaitent ni aux personnes qui souffrent de maladies inflammatoires du côlon ou de douleurs provoquées par un rétrécissement intestinal.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Celeri",
                "celeri",
                "Nom latin: \n" +
                        "Apium graveolens\n",
                "Famille: \n" +
                        "Apiacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "- Le céleri est un excellent diurétique. Il contribue à éliminer les calculs rénaux, ainsi que les toxines et les autres déchets présents dans l’organisme. Riche en vitamines et en sels \n" +
                        "minéraux, il permet de maintenir un taux de cholestérol équilibré et d’éviter les problèmes cardiovasculaires. Le céleri est aussi indiqué dans la prise en charge de l’hypertension, de l’obésité, de l’extinction de voix (aphonie), de la rétention d’eau et des douleurs menstruelles. Il agit efficacement contre l’excès d’acide urique et favorise la circulation sanguine. Il contient des flavonoïdes, des molécules qui ont des propriétés anti-inflammatoires et anti-oxydantes. Ces molécules permettent de soulager les douleurs articulaires provoquées par l’arthrite, la goutte et les rhumatismes. Cette plante a aussi un effet cicatrisant. En usage externe, on l’emploie sous forme de cataplasmes pour soigner les plaies.\n",
                "Parties utilisées :\n" +
                        "- La racine, les pétioles et les feuilles.\n",
                "Posologie :\n" +
                        "Utilisation interne :\n" +
                        "Puissant diurétique : le céleri élimine les toxines présentes dans l'organisme.\n" +
                        "Utilisation externe :\n" +
                        "L'huile essentielle de céleri a des propriétés calmantes et peut augmenter le tonus en cas de dépression.\n" +
                        "Indications thérapeutiques usuelles :\n" +
                        "Le céleri est particulièrement indiqué pour nettoyer les intestins. Il traite aussi les calculs rénaux et biliaires, et soulage les personnes atteintes d'arthrite, de goutte et de rhumatismes.\n" +
                        "Autres indications thérapeutiques démontrées :\n" +
                        "Le céleri a également la propriété de faire baisser la tension ; il est en outre efficace pour traiter les problèmes liés à la rétention d'eau.\n",
                "Précautions d'emploi :\n" +
                        "- Une prudence particulière est requise chez les femmes enceintes ou qui allaitent. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Centaurée (Petite)",
                "centaureepetite",
                "Nom latin: \n" +
                        "Centaurium erythraea (Erythraea centaurium)\n",
                "Famille: \n" +
                        "Gentianacées\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "La petite centaurée renferme des substances (appelées \"séco-irridoïdes\") aux propriétés toniques et stimulantes sur les sécrétions gastriques et l'appétit. Selon une étude menée par des chercheurs turcs en 1991, la plante serait anti-inflammatoire et antipyrétique, pour faire baisser la fièvre (1). L'effet diurétique de l'extrait aqueux des sommités fleuries de la centaurée a été démontré par une étude marocaine de 2000 (2). En usage externe, la plante entre dans la composition de lotions capillaires anti poux et anti chute de cheveux.\n",
                "Parties utilisées :\n" +
                        "Les sommités fleuries.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre le manque d'appétit, la dyspepsie chronique, l'achylie, les flatulences et l'asthénie\n" +
                        "Infusion : 1g de plante séchée pour 1 tasse d'eau bouillante. Laisser infuser 15 minutes. Boire 3 tasses par jour, avant les repas (tièdes ou froides).\n" +
                        "Ou\n" +
                        "Poudre (sachet-dose) : 1 ou 2g par prise, 2 ou 3 fois par jour.\n" +
                        "Ou\n" +
                        "Teinture-mère : 30 gouttes dans un verre d'eau, 3 fois par jour.\n" +
                        "En usage externe\n" +
                        "Contre les poux, la chute de cheveux\n" +
                        "Décoction : 30 à 50 g de plante séchée pour 1 litre d'eau. Laisser bouillir 2 à 3 minutes. Effectuer 1 ou 2 frictions par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Les traitements à base de petite centaurée ne doivent pas dépasser 10 jours. L'usage prolongé peut causer des irritations gastro-intestinales. La petite centaurée ne doit pas être utilisée en cas d'inflammation des voies digestives.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Cerise",
                "cerise",
                "Nom latin: \n" +
                        "Cerasus vulgaris\n",
                "Famille: \n" +
                        "Rosacée\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "- Grâce à ses propriétés diurétiques, la cerise est indiquée en cas d’insuffisance rénale, de néphrites, de cystites et de lithiase urinaire. Elle peut aussi être utilisée pour soigner les rhumatismes liés à la goutte. Grâce à sa propriété laxative, la cerise peut être utilisée pour soulager une constipation. De plus, cet ingrédient est connu pour être rafraichissant.\n",
                "Parties utilisées :\n" +
                        "- Les queues de cerise.\n",
                "Posologie :\n" +
                        "- Faire infuser une poignée de queues de cerise pendant 10 minutes dans un demi litre d’eau.\n",
                "Précautions d'emploi :\n" +
                        "L’utilisation des queues de cerises est proscrite aux personnes ayant des calculs rénaux. Il est conseillé aux femmes enceintes d’en consommer avec modération. Il est déconseillé de boire plus d’un litre de boisson contenant des queues de cerise.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Chardon Marie",
                "chardonmarie",
                "Nom latin: \n" +
                        "Silybum marianum (carduus marianus).\n",
                "Famille: \n" +
                        "Astéracées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Grâce à la silymarine qu’il contient, le chardon-Marie diminue l’effet des substances en cause dans la nécrose (destruction) des cellules du foie et la cirrhose. Il favorise l’élimination des toxines accumulées dans cet organe. Il peut être prescrit comme traitement adjuvant en cas d’hépatites chroniques, mais le chardon-Marie est surtout utile pour faciliter l’évacuation de la bile, apaiser les spasmes, soulager les troubles digestifs légers et ceux de la fonction biliaire.\n",
                "Parties utilisées :\n" +
                        "Le fruit et la feuille.\n",
                "Posologie :\n" +
                        "EN USAGE INTERNE \n" +
                        "Contre les troubles digestifs légers, troubles de la fonction biliaire \n" +
                        "Infusion : 1 cuil. à café de feuilles par tasse. Laisser infuser 10 min. Filtrer. 3 tasses par jour avant les repas.ouTeinture-mère : 30 gouttes dans un verre d’eau, 3 fois par jour avant les repas. \n" +
                        "Contre les hépatites chroniques, cirrhose (sur prescription médicale uniquement) \n" +
                        "Extrait sec titré à 140 mg : 3 gélules par jour au moment des repas. \n" +
                        "En cure détox \n" +
                        "Sous forme de décoction, poudre totale, teinture-mère (TM), extraits secs… (voir ci-dessous). \n" +
                        "Drainage spécial agapes : en préventif, 1 mois et/ou en curatif, 1 semaine. \n" +
                        "Drainage spécial minceur : 1 mois puis en cures discontinues (20 jours par mois) 2 mois de suite si besoin. \n" +
                        "Drainage anti-âge : 1 mois, renouvelable 2 à 3 fois par an à partir de 40 ans. \n" +
                        "Drainage spécial tonus : 1 mois, à renouveler si besoin 20 jours par mois pendant 3 mois. \n" +
                        "Drainage spécial antipollution : 1 mois puis 10 jours par mois pendant 2 mois, 2 fois par an.\n" +
                        " Drainage spécial convalescence : 1 mois, puis par cures discontinues de 20 jours par mois pendant 2 mois si besoin. \n" +
                        "Décoction : faire bouillir 50 g de graines dans 1 litre d’eau pendant 15 min. Laisser infuser 10 min et filtrer. 1 tasse 3 fois par jour avant les repas.ouExtrait sec en gélule de 100 mg : 1 gélule 3 fois par jour avant les repas.ouPoudre totale : en gélule de 300 mg, 2 gélules 3 fois par jour avant les repas.ou Teinture-mère (TM) 1 DH : 50 gouttes à prendre matin et soir dans un verre d’eau.ouForme pharmaceutique extrait titré en silymarine, Legalon® : en comprimés de 70 mg, 2 comprimés 3 fois par jour avant les repas. \n" +
                        "En cas de persistance des symptômes consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Le chardon-Marie est déconseillé en cas d’obstruction biliaire, de grossesse ou d’allaitement et chez l’enfant de moins de 6 ans.\n"

        );
        sqLiteHelper.insertData(
                "Chélidoine",
                "chelidoine",
                "Nom latin: \n" +
                        "Chelidonium majus.\n",
                "Famille: \n" +
                        "Papavéracées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "La chélidoine est reconnue pour stimuler la sécrétion de la bile, calmer les spasmes digestifs, être légèrement analgésique, hypnotique, antibactérienne et antivirale. Son suc est efficace contre les verrues. Des recherches sont en cours pour établir son action calmante sur le système nerveux (1).\n",
                "Parties utilisées :\n" +
                        "La plante entière.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les troubles hépato-biliaires et les désordres nerveux.\n" +
                        "Infusion : 1 cuillère à café de plante sèche pour une tasse d'eau bouillante. Laisser infuser 10 minutes et filtrer. Boire 3 tasses par jour (soit 2 à 5 g par jour, soit 10 à 30 mg d'alcaloïdes exprimés en chélidonine).\n" +
                        "Contre les verrues\n" +
                        "Extrait sec : 100 mg, 2 fois par jour.\n" +
                        "En usage externe\n" +
                        "Contre les verrues et le psoriasis\n" +
                        "Suc frais : en application locale, 1 à 3 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "La chélidoine présente un faible risque d'hépatotoxicité. Respectez les doses thérapeutiques et demandez l'avis d'un médecin avant toute prise. Attention: Ne jamais utilisez la plante fraîche en usage interne, elle est toxique !\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Chêne",
                "chene",
                "Nom latin: \n" +
                        "Quercus robur.\n",
                "Famille: \n" +
                        "Fagacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Astringent, le chêne est d'une aide précieuse en cas de diarrhées. Il favorise la cicatrisation de certaines plaies (eczéma humide ou gerçures par exemple).\n",
                "Parties utilisées :\n" +
                        "L’écorce.\n",
                "Posologie :\n" +
                        "EN USAGE EXTERNE \n" +
                        "Contre les problèmes de gorge \n" +
                        "Gargarismes : faites bouillir 80 à 100 g d’écorce en morceaux dans 1 litre d’eau, 10 min. Filtrer.3 à 4 fois par jour5 à 6 jours en traitement curatif. \n" +
                        "\n" +
                        "Contre les gerçures et l’eczéma humide \n" +
                        "Bain et compresses : faire bouillir 100 g d’écorce pulvérisée dans 1 litre d’eau, 20 min. Filtrer. Appliquer des compresses imbibées de lotion ou faire des bains de pieds et/ou mains, 3 à 4 fois par jour.En traitement curatif.\n" +
                        "EN USAGE INTERNE \n" +
                        "Contre la diarrhée \n" +
                        "Infusion : faites infuser 10 g d’écorce pulvérisée par tasse d’eau bouillante, 10 min.4 tasses par jour.5 à 6 jours en curatif.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Le chêne ne présenterait aucune toxicité à ce jour. Toutefois, ses vertus astringentes doivent limiter la durée de son emploi. Mieux vaut également éviter tout contact avec les yeux, ainsi que les bains en immersion totale. Il est contre-indiqué chez l’enfant de moins de 6 ans et chez la femme enceinte ou allaitante.\n"

        );
        sqLiteHelper.insertData(
                "Chicorée",
                "chicoree",
                "Nom latin: \n" +
                        "Cichorium intybus.\n",
                "Famille: \n" +
                        "Astéracées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "La chicorée est le plus souvent prescrite pour traiter les troubles du foie et des reins. Elle contient des lactones, substances qui stimulent l’appétit, favorisent la sécrétion biliaire et soulagent les troubles digestifs (ballonnement, éructations). Riche en acides phénols, elle a des vertus diurétiques. La chicorée agit aussi contre l’hyperlipémie (taux élevé de graisses en général dans le sang) et l’hypercholestérolémie. Enfin, elle peut être recommandée en complément d’un traitement contre les dermatoses (affections de la peau) ou la goutte (excès d’acide urique dans le sang).\n",
                "Parties utilisées :\n" +
                        "Les racines.\n",
                "Posologie :\n" +
                        "EN USAGE INTERNE \n" +
                        "\n" +
                        "Contre les troubles du foie et des reins, troubles digestifs (Utiliser la plante entière plutôt que la racine)\n" +
                        "Décoction : 15 à 30 g de racines, feuilles et fleurs séchées pour 1 litre d’eau. Faire bouillir 5 min. 1 tasse midi et soir avant les repas.\n" +
                        "En cure détox\n" +
                        "Sous forme de décoction ou de teinture mère (TM) (voir ci-dessous).\n" +
                        "Drainage spécial agapes : en curatif, 1 semaine.Drainage spécial circulation du sang : 1 mois, à renouveler tous les 3 mois si nécessaire.Drainage spécial digestion : 10 jours par mois, 3 mois.\n" +
                        "Décoction : laisser infuser 2 cuil. à café de racines écrasées dans 250 ml d’eau bouillante pendant 10 min. Filtrer. 1 tasse par jour.\n" +
                        "Ou\n" +
                        "Teinture-mère (TM) : 50 gouttes dans un verre d’eau à prendre matin et soir, avant les repas.\n" +
                        "En cas de persistance des symptômes consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Aucune toxicité n’a été signalée suite à une utilisation, même prolongée, de la chicorée. Seul inconvénient, la plante peut stimuler l’appétit, donc une prise de poids chez les personnes ayant une alimentation déséquilibrée. La chicorée est déconseillée aux femmes enceintes ou allaitantes, et aux enfants de moins de 6 ans.\n"

        );
        sqLiteHelper.insertData(
                "Chou",
                "chou",
                "Nom latin: \n" +
                        "Brassica oleracea.\n",
                "Famille: \n" +
                        "Brassicacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "- Cru ou cuit, par voie interne ou externe : le chou est un légume populaire omniprésent sur les tables qui possède de nombreux bienfaits. Il est riche en vitamines (en particulier en vitamines C), en fibres et en minéraux. Il est utilisé en phytothérapie pour son action antiseptique (il désinfecte les plaies), anti-inflammatoire, antioxydante (il ralentit le vieillissement des cellules), laxative et anticancéreuse. Il permet de traiter les douleurs diverses (rhumatismes, sciatiques, douleurs dentaires), les affections respiratoires (rhumes, bronchites), les infections intestinales, les contusions, les hémorroïdes, la fatigue, l’anémie, les plaies et autres lésions cutanées (abcès, furoncles, ulcères). Recommandé par les diététiciens, il contribue à l’équilibre de l’organisme et est inclus dans le régime alimentaire recommandé aux diabétiques. Le chou prévient également les troubles cardio-vasculaires et diminue le risque de cancer.\n",
                "Parties utilisées :\n" +
                        "- Les feuilles.\n",
                "Posologie :\n" +
                        "En usage interne \n" +
                        "Contre la fatigue et l’anémie. \n" +
                        "Jus : Boire un verre de jus de chou par jour pendant 3 semaines (en dehors des repas). \n" +
                        "Contre les bronchites. \n" +
                        "Décoction : Placer 2 grandes feuilles de chou dans de l’eau froide, puis faire bouillir pendant 30 minutes. Boire 1 litre par jour en plusieurs fois. \n" +
                        "Ou \n" +
                        "Jus : Boire 1 ou 2 verres de jus de chou rouge par jour. \n" +
                        "Contre les ulcères de l’estomac. \n" +
                        "Jus : Boire 2 à 3 verres de jus de chou rouge par jour, pendant 3 semaines (en dehors des repas). \n" +
                        "Pour prévenir les infections intestinales d’origine parasitaire (chez les enfants). \n" +
                        "Jus : Boire 1 verre ou ½ verre de jus de chou le matin à jeun, pendant 3 jours. Débuter le traitement un jour de pleine lune. Suivre le traitement pendant au moins 3 mois. \n" +
                        "En usage externe \n" +
                        "Contre les ulcères de jambe. \n" +
                        "Cataplasme : Placer 3 ou 4 feuilles de chou entre 2 linges et appliquer directement sur les lésions. Appliquer le linge toutes les 4 ou 6 heures et pendant la nuit. \n" +
                        "N.B. : Cette cure doit être accompagnée d’un suivi médical. Si une douleur apparaît, respecter un intervalle de 6 à 12 heures entre chaque cataplasme. \n" +
                        "Pour traiter les plaies, les furoncles et les abcès. \n" +
                        "Cataplasme : Placer 3 épaisseurs de feuilles de chou entre 2 linges et appliquer directement sur les lésions. Répéter l’opération toutes les 2, 3 ou 4 heures jusqu’à la cicatrisation. \n" +
                        "N.B. : Entre chaque application, ne pas hésiter à nettoyer la lésion avec du sérum physiologique si celle-ci contient du pus. \n" +
                        "Contre les gerçures et les crevasses. \n" +
                        "Cataplasme : Placer entre 2 linges des feuilles de chou découpées en bandes étroites et imbibées d’huile d’olive. Appliquer sur les lésions pendant toute la nuit. \n" +
                        "Contre les hémorroïdes. \n" +
                        "Cataplasme : Placer entre 2 linges des feuilles de chou découpées en bandes étroites. Appliquer sur les lésions pendant toute la nuit.\n",
                "Précautions d'emploi :\n" +
                        "- Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Chrysanthellum",
                "chrysanthellum",
                "Nom latin: \n" +
                        "Chrysanthellum indicum.\n",
                "Famille: \n" +
                        "Astéracées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Selon plusieurs données cliniques encourageantes, le chrysanthellum permet de combattre l’excès de cholestérol. Il prévient également certains types de calculs biliaires, favorise la résistance capillaire (petits vaisseaux sanguins) et améliore le tonus veineux - d’où son utilisation dans le traitement des jambes lourdes !\n",
                "Parties utilisées :\n" +
                        "La plante entière.\n",
                "Posologie :\n" +
                        "EN USAGE INTERNE\n" +
                        "Contre l’excès de cholestérol et dans les suites d’atteintes hépatiques, après avis d’un médecin phytothérapeute\n" +
                        "Extrait sec : 300 mg 2 fois par jour, avant les repas. Prises annuelles si besoin\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Le chrysanthellum peut provoquer des colites biliaires bénignes et réversibles. Un avis médical est donc indispensable avant toute prise. La plante ne doit pas être donnée chez l’enfant de moins de 6 ans.\n"

        );
        sqLiteHelper.insertData(
                "Cigue",
                "cigue",
                "Nom latin : Conium maculatum ",
                "Famille: Apiacées (Ombellifères) ",
                "Type:Fleur.",
                "Propriétés: L’utilisation de la cigüe à des fins thérapeutiques requiert une vigilance particulière en raison du poison qu’elle contient. Cette plante possède des propriétés analgésiques (elle soulage les douleurs) et antispasmodiques (elle prévient les tremblements involontaires). Elle est surtout utilisée pour diminuer les raideurs musculaires chez les patients atteints de la maladie de Parkinson, ainsi que pour éliminer les spasmes (utérus, intestins, œsophage…). La ciguë permet également de traiter la toux provoquée par les maladies respiratoires, notamment l’asthme et la coqueluche. Certains lui attribuent une propriété anticancéreuse qui n’a cependant pas encore été scientifiquement prouvée.",
                "Parties utilisées : Les feuilles et les graines.",
                "Posologie: \n"+
                        "En usage externe :\n"+
                        "Pour soulager les douleurs chez les femmes atteintes d’un cancer du sein inopérable.\n"+
                        "Cataplasmes : Mélanger 10 g de poudre de feuilles de ciguë et 250-300 g de pulpe de carotte crue. Envelopper le mélange dans de la gaze et appliquer directement sur les seins.\n"+
                        " Ou\n"+
                        "Pommade : Mélanger 1 g d’extrait de ciguë avec 1 g d’extrait d’opium, 1 g d’extrait de jusquiame, 5 g d’extrait de houblon et 100 g d’axonge. Appliquer directement sur les zones douloureuses.\n"+
                        "En cas de doute sur la posologie, demander conseil à un médecin ou pharmacien spécialisé en phytothérapie.\n"+
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n"+
                        "La grande ciguë est une plante empoisonneuse. A fortes doses, elle interrompt la respiration et paralyse les muscles.\n"+
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Cola",
                "cola",
                "Nom latin: \n" +
                        "Cola acuminata, nitica, verticillata, ballayi.\n",
                "Famille: \n" +
                        "Sterculiacée.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "-Indiquée pour soigner la grippe, la cola est reconnue pour apporter du tonus au niveau cardiaque et musculaire. Elle est très bénéfique chez les sportifs. De plus cette plante stimule le système nerveux. La plante a également des vertus aphrodisiaques.\n",
                "Parties utilisées :\n" +
                        "-Les graines.\n",
                "Posologie :\n" +
                        "- Manger 4 à 8g de graines de cola écrasées par jour.\n",
                "Précautions d'emploi :\n" +
                        "- Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées. Demander conseil à son médecin.\n"

        );
        sqLiteHelper.insertData(
                "Coloquinte",
                "coloquinte",
                "Nom latin: Citrullus colocynthis.\n",
                "Famille : Cucurbitacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :La coloquinte est essentiellement utilisée pour sa propriété purgative. La pulpe de son fruit contient des molécules qui facilitent le transit intestinal, raison pour laquelle on l’emploie en tant que laxatif violent. Cette sorte de courge est indiquée dans la prise en charge des états congestifs, de la goutte, des urémies (diminution du volume d’urée généralement associée à une insuffisance rénale), des ascites (accumulation de liquide au niveau du péritoine) et des cirrhoses. La coloquinte est aussi parfois utilisée en cas d’asystolie (arrêt cardiaque).\n",
                "Parties utilisées : La pulpe du fruit.\n",
                "Posologie :\n"+
                        "En usage interne, la coloquinte s'utilise en extrait, en pilules ou en vin.\n"+
                        "Précautions d'emploi:\n"+
                        "Demander conseil à un pharmacien spécialisé.\n",
                "La coloquinte est contre-indiquée chez les personnes atteintes de spasmes intestinaux, d’hémorroïdes, d’infection bactérienne provoquée par un colibacille (colibacillose), d’inflammation de l’intestin grêle (entérite) ou de congestion pelvienne. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Coquelicot",
                "coquelicot",
                "Nom latin: \n" +
                        "Papaver rhoeas.\n",
                "Famille: \n" +
                        "Papavéracée.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "- Le coquelicot est utilisé pour traiter les insomnies des personnes délicates comme les enfants ou les personnes âgées. Antispasmodique et sédatif, il calme la toux provoquée par des bronchites ou des pneumonies. Grâce à son action sudorifique, le coquelicot permet de faire redescendre la fièvre.\n",
                "Parties utilisées :\n" +
                        "- Les fleurs.\n",
                "Posologie :\n" +
                        "- Faire une infusion d’une cuillère à café de fleurs séchées dans une tasse d’eau bouillante. \n" +
                        "Laisser infuser une dizaine de minutes. En boire trois tasses par jour.\n",
                "Précautions d'emploi :\n" +
                        "Le coquelicot est interdit aux femmes enceintes et allaitantes ainsi qu'aux enfants de mois de 10 ans.\n" +
                        "- Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées. Demander conseil à son médecin.\n"
        );
        sqLiteHelper.insertData(
                "Coriandre",
                "coriandre",
                "Nom latin: \n" +
                        "Coriandrum Sativum\n",
                "Famille: \n" +
                        "Apiacées\n",
                "Type:Feuille.",
                "Propriétés :\n" +
                        "Les grains de coriandre possèdent des vertus antispasmodiques. Ils aident à expulser les gaz intestinaux et régulent leurs sécrétions. On les utilise pour traiter les diarrhées, notamment dues aux gastro-entérites. Ces grains aident également à lutter contre les bactéries (1) et les mycoses. Enfin, des recherches réalisées chez les rats ont souligné que l’ajout de graines de coriandre à leur diète diminuait le taux de \"mauvais\" cholestérol (LDL) et de triglycérides (2,3).\n",
                "Parties utilisées :\n" +
                        "Fruits (grains de coriandre) et feuilles.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les troubles digestifs, les diarrhées\n" +
                        "Infusion : Laisser infuser 10 à 30g de grains de coriandre séchés et écrasés pour 1 litre d’eau. Boire une tasse après chaque repas jusqu’à amélioration des symptômes.\n" +
                        "Ou\n" +
                        "Teinture-mère : doser 40 gouttes dans un verre d’eau. Boire 3 fois par jour jusqu’à amélioration des symptômes.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Il n'y a aucun risque connu à consommer de la coriandre, qu'il s'agisse de ses fruits ou de ses feuilles.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Cumin",
                "cumin",
                "Nom latin: \n" +
                        "Cuminum cyminum.\n",
                "Famille: \n" +
                        "Apiacées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Le cumin est connu pour ses vertus carminatives (expulsion des gaz intestinaux), et antispasmodiques (pour faciliter la digestion). Selon l’Institut du cancer de Madras (Inde), le cumin agirait contre les cancers du foie et de l’estomac chez le rat. En usage externe, il est préconisé sous forme de pommades pour soulager les articulations douloureuses.\n",
                "Parties utilisées :\n" +
                        "Les graines.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre la digestion difficile, les flatulences, les infections intestinales\n" +
                        "Infusion : Laisser infuser une cuillère à café de graines dans 25 cl d’eau bouillante durant 2 à 3 minutes. Boire une demi-tasse avant les repas jusqu’à amélioration des symptômes.\n" +
                        "En usage externe\n" +
                        "Contre les articulations douloureuses.\n" +
                        "Pommades et gels : appliquer sur les zones douloureuses et frictionner lentement 1 ou 2 fois par jour, jusqu’à amélioration des symptômes.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "L’huile essentielle de cumin est toxique si elle est consommée à fortes doses. Demandez conseil à votre pharmacien ou à votre médecin avant toute prise.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );

        sqLiteHelper.insertData(
                "Curcuma",
                "curcuma",
                "Nom latin: \n" +
                        "Curcuma longa.\n",
                "Famille: \n" +
                        "Zingibéracées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Le curcuma stimule la sécrétion de la bile, donc la digestion. Ses bienfaits sont reconnus par l’OMS pour soigner la dyspepsie (maux d'estomac, nausées, perte d’appétit…). Par ailleurs, selon des études menées sur des animaux, il pourrait contrer la bactérie Helicobacter pylori, responsable d’ulcères gastriques et duodénaux (1,2). Enfin le rhizome de curcuma contient des curcuminoïdes, des substances antioxydantes et anti-inflammatoires, ce qui lui confèrerait des effets anticancer. Des données épidémiologiques ont d’ailleurs souligné que la prévalence de plusieurs cancers (côlon, sein, prostate, poumon) était moindre en Asie, continent où l’on consomme beaucoup de curcuma (3,4).\n",
                "Parties utilisées :\n" +
                        "Le rhizome.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les troubles de la digestion\n" +
                        "Infusion : 0,5 à 1g de poudre de rhizome dans 150ml d’eau bouillante durant 5 à 10 min. Filtrer. Boire 2 à 4 tasses par jour, de préférence pendant les repas, jusqu’à amélioration des symptômes.\n" +
                        "Ou\n" +
                        "Teinture-mère : Verser 35 gouttes dans un verre d’eau. A boire après chaque repas, jusqu’à amélioration des symptômes.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Le curcuma est contre-indiqué en cas d’obstruction des voies biliaires et d’allergie à la plante. Même chose pour les femmes enceintes, allaitantes et chez les personnes de moins de 18 ans (hors usage alimentaire). Il est déconseillé à doses élevée en cas d’ulcère de l’estomac ou du duodénum car il peut augmenter l’irritation. Demandez l’avis d’un médecin ou d’un pharmacien avant toute prise.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Cyprès",
                "cypres",
                "Nom latin: \n" +
                        "Cupressus sempervirens.\n",
                "Famille: \n" +
                        "Cupressacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Le cyprès joue un rôle angioprotecteur en renforçant les vaisseaux sanguins. On l’utilise pour soulager les troubles de l’insuffisance veineuse tels que les jambes lourdes, les varices, les hémorroïdes… Sa fonction veinotonique vient principalement de ses oligomères flavanoliques, des substances qui stimulent la circulation sanguine périphérique.\n",
                "Parties utilisées :\n" +
                        "Les fruits (cônes).\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les jambes lourdes, varices et hémorroïdes\n" +
                        "Infusion : laisser infuser 1 sachet-dose dans une tasse d’eau bouillante. Boire 4 tasses par jour, avant ou entre les repas.\n" +
                        "Ou\n" +
                        "Gélules de poudre : 1 gélule matin, midi et soir, au moment des repas.\n" +
                        "Ou\n" +
                        "Comprimés : 2 à 3 comprimés par jour au moment des repas.\n" +
                        "Ou\n" +
                        "Solutions buvables : 40 à 60 gouttes à diluer dans un peu d’eau. A boire 2 à 3 fois par jour avant les repas.\n" +
                        "En usage externe\n" +
                        "Contre les jambes lourdes, les varices\n" +
                        "Gels, pommades : au coucher, appliquer sur les régions variqueuses de bas en haut, en appuyant légèrement, jusqu’à pénétration.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "La consommation de cyprès ne présente aucun risque connu à ce jour, aux doses recommandées.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Digitale",
                "digitale",
                "Nom latin:  Digitalis purpurea.",
                "Famille: Scrofulariées.",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Grâce à son effet tonicardiaque, la digitale contribue à ralentir et à régulariser les contractions cardiaques. C’est pourquoi elle est utilisée pour traiter des pathologies du cœur telles que l’insuffisance du myocarde (muscle du cœur), l’arythmie, l’asystolie (arrêt cardiaque) et la tachycardie (accélération du rythme cardiaque). Cette plante a également des propriétés diurétiques. Elle agit contre les néphrites (inflammations des reins), les oliguries (diminution du volume des urines), les œdèmes et les ascites (accumulation de liquide au niveau du péritoine).\n" ,
                "Parties utilisées :\n" +
                        "Les feuilles.\n",
                "Posologie :\n" +
                        "En usage interne, la digitale s'utilise en infusion, en macération, en pilules ou en teinture.\n" +
                        "Demander conseil à un pharmacien spécialisé.\n",
                "Précautions d'emploi :\n" +
                        "En raison de la sa toxicité, la digitale nécessite une posologie adaptée à chaque patient et à la pathologie à traiter. Cette plante peut entraîner plusieurs effets indésirables tels que des troubles digestifs (nausées, vomissements, diarrhées), des vertiges, des maux de tête, une anémie et des troubles visuels (diplopie). Elle est contre-indiquée en cas d’aortite (inflammation de l’aorte), d’embolie, d’anévrisme, d’hémorragie cérébrale, de maladie de Basedow ou de fièvre typhoïde. Attention : Les plantes ne sont pas des remèdes anodins.Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Douce-Amère",
                "douceamere",
                "Nom latin:  Solanum dulcamara.",
                "Famille:  Solanées.",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "La douce-amère, grâce à son un effet dépuratif, agit efficacement contre l’hyperviscosité sanguine et la surabondance de sang (pléthore). Elle est utilisée pour traiter certaines maladies de la peau (acné, eczéma, psoriasis, herpès), la syphilis, les rhumatismes, la goutte et la furonculose (infections à répétition du follicule pileux). Cette plante est également efficace dans le traitement de pathologies respiratoires (asthme, pneumonie, bronchite chronique, coqueluche, pleurésie), des contusions, des hémorroïdes et des abcès. Elle aurait également des propriétés anticancéreuses.\n" ,
                "Parties utilisées :\n" +
                        "La tige, les feuilles et les baies.\n",
                "Posologie :\n" +
                        "En usage externe\n" +
                        "Pour soigner les lésions cutanées et les hémorroïdes. Faire bouillir 1 poignée de tiges ou de baies pour 1 litre d’eau pendant 10 minutes.\n" +
                        "Appliquer directement sur les zones affectées.\n" +
                        "Ou\n" +
                        "Cataplasmes : Mélanger 4 poignées de feuilles pilées avec 120 g de farine de lin et les bouillir avec du lard.\n" +
                        "Appliquer le remède chaud directement sur les lésions.\n" +
                        "Ou\n" +
                        "Pour les contusions et les abcès du sein. Feuilles fraîches : Appliquer les feuilles fraîches écrasées sur les contusions et les abcès.\n" +
                        "\n" ,
                " Précautions d'emploi\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins.\n" +
                        "Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Droséra",
                "drosera",
                "Nom latin:  Drosera rotundifolia, D. intermedia, D. anglica.",
                "Famille:  Droséracée.",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Le droséra possède des vertus antitussives et expectorantes. Elle soulage les spasmes bronchiques, la bronchite, la toux d’irritation et peut être indiquée en cas de coqueluche. En usage externe, son suc frais peut agir contre les verrues.\n",
                "Parties utilisées :\n"+
                        "La plante entière.",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les spasmes bronchiques, la bronchite, la toux d’irritation, la coqueluche\n" +
                        "Infusion : Faire infuser 10 g de plante séchée pour 1 litre d’eau bouillante pendant 10 min. Filtrer et boire 2 tasses par jour.\n" +
                        "Ou\n" +
                        "Teinture-mère : Mettre 10 gouttes dans un verre d’eau, boire 3 verres par jour. A prendre jusqu’à disparition des symptômes.\n" +
                        "Ou\n" +
                        "Teinture : Faire macérer 50g de droséra frais dans 25cl d’alcool à 60 degrés durant 10 jours. Pour les enfants: 5 à 10 gouttes dans un verre d’eau, 2 ou 3 fois par jour. Pour les adultes: 10 à 20 gouttes dans un verre d’eau, 2 ou 3 fois par jour.\n" +
                        "En usage externe\n" +
                        "Contre les verrues\n" +
                        "Suc frais: appliquer sur les verrues, 1 ou 2 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Le droséra peut irriter la peau et les muqueuses, provoquer des diarrhées et des nausées. Sa consommation orale est interdite en cas d’ulcère gastro-intestinal et déconseillée à jeun. Mieux vaut le consommer dilué. Demandez conseil à votre médecin ou à votre pharmacien avant toute prise.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );

        sqLiteHelper.insertData(
                "Echinacée",
                "echinacee",
                "Nom latin:  Echinacea angustifolia, E. purpurea, E. pallida.",
                "Famille:  Astéracées.",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "L’éch" +
                        "inacée augmente la résistance à certaines infections comme la grippe, la rhinite et la bronchite. Une étude menée auprès de 755 personnes a démontré que cette plante pouvait réduire de 26% la fréquence et la durée d'un rhume (1). Elle boosterait l’immunité. Elle est d’ailleurs surtout utilisée dans le traitement des maladies infectieuses, contre l’affaiblissement des défenses immunitaires.\n" ,
                "Parties utilisées :\n" +
                        "Elles dépendent des espèces. Il peut s’agir de la racine, comme des parties aériennes ou de la plante entière.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre la grippe, la rhinite, la bronchite et booster les défenses, en curatif\n" +
                        "\n" +
                        "Gélules dosées à 325 mg de poudre de racine : 1 à 3 par jour avec un grand verre d’eau, avant les repas.\n" +
                        "Contre la grippe, la rhinite, la bronchite, et booster les défenses, en préventif \n" +
                        "Gélules dosées à 325 mg de poudre de racine : 2 par jour. \n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n" ,
                "Précautions d'emploi :\n" +
                        "L’échinacée est bien tolérée, mais l’avis d’un médecin phytothérapeute s’impose avant toute prise. Premièrement, parce que la plante ne dispense pas d’antibiotiques et autres agents anti-infectieux. Deuxièmement, parce que son auto administration peut vous faire passer à côté d’une infection grave. Elle est déconseillée en dessous de 6 ans et chez la femme enceinte ou allaitante sans conseil médical.\n"
                        +"Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées."

        );
        sqLiteHelper.insertData(
                "Eglantier",
                "eglantier",
                "Nom latin:  Rosa canina.",
                "Famille:  Rosacées.",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Riche en vitamine C, le cynorrhodon, la baie de l’églantier, est utilisé comme tonique et renfort des défenses immunitaires. Selon deux essais cliniques menés au Danemark, il pourrait aussi diminuer les douleurs arthrosiques (1,2). Enfin, on attribue à la plante des effets anti-diarrhéiques, diurétiques et astringents.\n" ,
                "Parties utilisées :\n" +
                        "Les cynorrhodons.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les refroidissements, les infections grippales, les carences en vitamine C, la fatigue\n" +
                        "Infusion : Faire infuser 2 à 2,5g de cynorrhodon fragmenté pour une tasse d’eau bouillante durant 10 minutes et filtrer. Boire 3 tasses par jour.\n" +
                        "Ou\n" +
                        "Gélules dosées à 50-200 mg d’extrait sec : 1 ou 2 gélules avec un grand verre d’eau. A prendre 3 fois par jour, avant les repas.\n" +
                        "Ou\n" +
                        "Teinture-mère : verser 40 gouttes dans un verre d’eau, à boire 3 fois par jour avant les repas.\n" +
                        "Contre la diarrhée\n" +
                        "Décoction : Faire bouillir 30 à 50g de cynorrhodon en morceaux pour un litre d’eau bouillante durant 5 minutes, à feu doux. Laisser infuser 15 minutes puis filtrer. A boire à volonté, de préférence au petit-déjeuner, jusqu’à amélioration des symptômes.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n" ,
                "Précautions d'emploi :\n" +
                        "L’églantier n’a aucun effet toxique connu à ce jour, aux doses recommandées.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Eleuthérocoque",
                "eleutherocoque",
                "Nom latin:  Eleutherococcus senticosus ou Acanthopanax senticosus.",
                "Famille: Araliacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "La racine d’éleuthérocoque contient des substances immunostimulantes et antivirales, comme cela a été prouvé par des chercheurs allemands en 2001 (1). Elle est ainsi recommandée en prévention des infections hivernales (rhume, rhinopharyngite, angine…) mais aussi pour aider l’organisme à lutter contre le stress et la fatigue. Cette dernière indication étant reconnue par l’OMS. Enfin, une étude menée sur 93 sujets atteints d’herpès génital a démontré que la plante pouvait réduire le nombre de crises (2).\n" ,
                "Parties utilisées :La racine\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre le stress, l’asthénie, les affections virales\n" +
                        "Gélules dosées à 0,45g de poudre : 2 gélules, à prendre deux fois par jour avec un verre d’eau. Pas plus de trois mois.\n" +
                        "Ou\n" +
                        "Gélules dosées à 50mg d’extrait sec : 4 à 6 par jour avec un verre d’eau. Pas plus de trois mois.\n" +
                        "Ou\n" +
                        "Teinture-mère : verser 25 à 150 gouttes par jour dans un verre d’eau, selon l’intensité des troubles. Pas plus de trois mois.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n" ,
                "Précautions d'emploi :\n" +
                        "L’éleuthérocoque est déconseillé pour la femme enceinte, allaitante, sous contraceptif oral, les enfants de moins de 12 ans, les personnes souffrant d'hypertension artérielle, d’insomnie, de troubles nerveux, de diabète, d’obésité, de maladies cardiaques et de cancer ou d’autre maladie du sein. En cas de doute, demandez un avis médical.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Ellébore Blanc",
                "elleboreblanc",
                "Veratrum album.",
                "Famille:  Colchicacées.",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "L’ellébore blanc a des propriétés antispasmodiques (il évite les contractions musculaires involontaires), analgésiques (il apaise la douleur) et sédatives (il « endort » le système nerveux et réduit les réflexes). Il est utilisé à faibles doses pour lutter contre les palpitations provoquées par la maladie de Basedow, les crampes et l’hypertension artérielle. Grâce à son effet analgésique, il agit efficacement contre la goutte et le zona (infection virale proche de la varicelle).\n" ,
                "Parties utilisées :\n" +
                        "La racine.\n",
                "Posologie :\n" +
                        "En usage interne, la plante peut être prise en pilules ou comprimés, ou extrait ou teinture.\n" +
                        "Demander conseil à un pharmacien spécialisé.\n" +
                        "En usage externe\n" +
                        "Pour apaiser les douleurs. Pommade analgésique.\n" ,
                "Précautions d'emploi :\n" +
                        "L’ellébore blanc contient de la vératrine. Cette substance active est un poison très violent qui peut entraîner la paralysie des nerfs et conduire au décès. C’est pourquoi cette plante doit être administrée à faibles doses et la posologie doit être strictement respectée. Attention : Les plantes ne sont pas des remèdes anodins.\n" +
                        "Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Ephédra",
                "ephedra",
                "Nom latin:  Ephedra vulgaris.",
                "Famille:  Gnétacées.",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "L’éphédra contient de l’éphédrine, une substance active proche de l’adrénaline appréciée pour son effet antiasthmatique (elle agit contre l’asthme), eupnéique (elle décongestionne les voies \n" +
                        "respiratoires) et vasoconstricteur (elle rétrécit le calibre des vaisseaux sanguins). Cette plante est aujourd’hui surtout utilisée pour traiter des affections respiratoires (asthme, dyspnées), la fièvre et les rhumes, notamment la rhinite allergique ou rhume des foins. Elle a des propriétés antiallergiques et agit efficacement contre certaines allergies telles que l’urticaire. L’éphédrine est aussi indiquée chez les patients qui ont été victimes d’un infarctus du myocarde (crise cardiaque).\n",
                "Parties utilisées :\n"+
                        "La plante et son principe actif (éphédrine).\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Pour prévenir l’asthme et l’urticaire. Infusion : Faire bouillir entre 10 et 20 g de feuilles pour 1 litre d’eau.\n" +
                        "Boire 3 tasses par jour (1 tasse avant chaque repas).\n" +
                        "Ou\n" +
                        "Comprimés : Prendre entre 3 et 10 cg d’éphédrine par jour, en plusieurs fois.\n" +
                        "Les doses maximales à ne pas dépasser sont de 8 cg par prise, et de 25 cg par jour.\n" +
                        "En usage externe : par voie rectale ou en pulvérisations nasales.\n" +
                        "Demander conseil à un pharmacien spécialisé.\n",
                " Précautions d'emploi :\n" +
                        "Cette plante est contre-indiquée chez les personnes atteintes de sympathicotonie (sensibilité \n" +
                        "anormalement élevée du système nerveux sympathique), d’hypertension ou de la maladie de Basedow (maladie de la thyroïde d’origine auto-immune). Attention : Les plantes ne sont pas des remèdes anodins.\n" +
                        "Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Epilobe",
                "epilobe",
                "Nom latin:  Epilobium parviflorum, epilobium angustifoliuma.\n",
                "Famille:  Onagracées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "L’épilobe est surtout utilisé pour améliorer les symptômes associés à l’hypertrophie bénigne de la prostate. L’effet bénéfique de cette plante se doit à la présence d’œnothéines A et B. Ces substances agissent sur le fonctionnement de l’appareil urinaire. Elles améliorent le débit urinaire du patient et réduisent le nombre de mictions nocturnes.\n" ,
                "Parties utilisées :" +
                        "Les fleurs et les feuilles.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Pour soulager les symptômes de l’adénome de la prostate (hypertrophie).\n" +
                        "Infusion : Mélanger 50 g de feuilles d’épilobe avec 50 g de bruyère (fleurs), de busserole (feuilles), de cyprès (cônes) et d’ortie piquante (racines).\n" +
                        "Faire bouillir une cuillère à soupe du mélange obtenu pour 1 tasse d’eau, pendant 3 minutes.\n" +
                        "Laisser infuser 10 minutes. Boire entre 2 et 3 tasses par jour, 15 jours par mois.\n" ,
                " Précautions d'emploi :\n" +
                        "L’épilobe est une plante bien tolérée et aucun effet indésirable associé n’a été signalé jusqu’à présent. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Ergot de seigle",
                "ergotdeseigle",
                "Nom latin: Claviceps purpurea.",
                "Famille: Champignons.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "L’ergot de seigle a des propriétés stimulantes et vasoconstrictrices (il diminue le calibre des vaisseaux sanguins). Il est utilisé pour soigner les hémorragies provoquées par l’accouchement, les fibromes (tumeurs bénignes), les cancers et les polypes. Il agit efficacement contre l’incontinence d’urine, la chute du rectum (prolapsus), la spermatorrhée (écoulement du sperme en dehors de l’éjaculation), les migraines, les tachycardies, la couperose ainsi que contre les sueurs liées à la ménopause et à la tuberculose.\n" ,
                "Parties utilisées : Le champignon entier.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Poudre d’ergot frais (action lente et prolongée) : 1 à 3 g par jour, à délayer dans un liquide ou à prendre sous forme de comprimé de 0,50 g.\n" +
                        "A prendre en 3 fois avec un intervalle d’au moins 30 minutes entre chaque prise.\n" +
                        "Ou\n" +
                        "Extrait mou - Ergotine Bonjean (action courte et rapide) : Entre 1 et 5 g par jour.\n" +
                        "A prendre en potion ou en pilules. Extrait fluide - Ergotine Yvon (action courte et rapide) : Entre 1 et 3 g par jour.\n" +
                        "A administrer en injections sous-cutanées.\n" ,
                " Précautions d'emploi :\n" +
                        "L’ergot de seigle est un champignon toxique qui contient plusieurs alcaloïdes, dont l’acide lysergique à partir duquel est fabriqué le LSD. Une intoxication à l’ergot de seigle peut \n" +
                        "provoquer des hallucinations, des vertiges, des convulsions, des spasmes et une gangrène. Dans les cas les plus graves, il peut conduire au décès. Attention : Les plantes ne sont pas des remèdes anodins.\n" +
                        "Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Eschscholtzia",
                "eschscholtzia",
                "Nom latin:  Eschscholtzia californica.\n",
                "Famille: Papavéracées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "On reconnaît à l’eschscholtzia des propriétés spasmolytiques et légèrement analgésiques (antidouleur). Ses préparations facilitent l’endormissement et améliorent la qualité du sommeil.\n" ,
                "Parties utilisées :\n" +
                        "Les parties utilisées sont les parties aériennes.\n" ,
                "Posologie\n" +
                        "En usage interne\n" +
                        "Contre les troubles du sommeil, le surmenage\n" +
                        "Infusion : 1 cuillère à café de plante séchée par tasse d’eau bouillante. Laisser infuser 10 min. Filtrer. Boire une ou 2 tasses le soir.\n" +
                        "Ou\n" +
                        "Extrait fluide : 1 à 2 ml dans un verre d’eau le soir.\n" +
                        "Ou\n" +
                        "Gélules dosées à 50-75 mg d’extrait sec : 1 ou 2, le soir au coucher\n" +
                        "Ou\n" +
                        "Teinture-mère : 45 à 75 gouttes dans un verre d’eau, le soir.\n" +
                        "En cas de persistance des symptômes consultez rapidement un médecin.\n",
                "Précautions d'emploi :\n" +
                        "L’eschscholtzia ne présente pas à ce jour d’effets indésirables. Ne pas donner en dessous de 6 ans sans avis médical.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Eucalyptus",
                "eucalyptus",
                "Nom latin : \n"+
                        " Eucalyptus globulus",
                "Famille : \n"+
                        "Myrtacées",
                "Type:Feuille.",
                "Propriétés : \n"+
                        "L’eucalyptus soigne les affections des voies respiratoires, notamment les rhumes. Il est d’ailleurs utilisé dans quantité de médicaments allopathiques. Antiseptique puissant, il calme la toux et empêche le développement des germes pathogènes. Il ferait également baisser le taux de sucre dans le sang grâce aux flavonoïdes qu’il contient.",
                "Parties utilisées : \n"+
                        "Les feuilles.",
                "Posologie : \n"+
                        "En usage externe:\n"+
                        " Contre les rhumes et le nez bouché:\n"+
                        "Infusion : inhalation d’une infusion de feuilles ou d’huile essentielle (HE), 2 fois par jour.\n"+
                        "Contre les affections bronchiques, maux de gorge, toux\n"+
                        "Huile essentielle (HE) : quelques gouttes frictionnées sur la poitrine et la gorge, une fois par jour.\n"+
                        "En usage interne:\n"+
                        "Contre les affections bronchiques, maux de gorge, toux.\n"+
                        "Teinture mère (TM) : 50 gouttes dans un grand verre d’eau, 4 à 6 fois par jour.\n"+
                        "En cas de persistance des symptômes, consultez un médecin.",
                "Précautions : \n"+
                        "Attention, la consommation d’huile essentielle (HE) peut occasionner des troubles rénaux. Un avis médical s’impose. La plante est contre-indiquée chez l’enfants de moins de 6 ans et la femme enceinte ou allaitante."+
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées."

        );
        sqLiteHelper.insertData(
                "Fenouil",
                "fenouil",
                "Nom latin: Foeniculum vulgare var. dulce. \n",
                "Famille: Apiacées. \n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Le fenouil contient de l’anéthol qui active les contractions de l'intestin. L’OMS reconnaît ainsi son usage en cas de flatulences, de ballonnements, d’éructations et de maux de ventre. Selon une étude brésilienne menée sur 20 personnes, il serait aussi efficace contre la constipation chronique (1). Sa racine faciliterait, elle, l’élimination urinaire. Enfin, le fenouil dispose de propriétés expectorantes et stimulantes sur les sécrétions respiratoires, d’où son indication en cas de toux grasse.\n",
                "Parties utilisées :\n" +
                        "Le fruit et la racine.\n",
                "Posologie :\n" +
                        "En usage interne:\n" +
                        "Contre les troubles digestifs\n" +
                        "Infusion : Faire infuser une cuillère à café de fruits séchés pour 20 cl d’eau. A boire 3 fois par jour après les repas. Ou soluté buvable : 1 sachet-dose, 3 fois par jour.\n" +
                        "Comme dépuratif:\n" +
                        "Infusion : Faire infuser un sachet-dose de racine de fenouil doux dans une tasse d’eau bouillante. En boire une le matin à jeun, une après le déjeuner et une après le diner.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "L’usage thérapeutique du fenouil est contre-indiqué en cas d’allergie et de cancers hormono-dépendant (sein, utérus, ovaire) ou d’antécédents (la plante ayant des propriétés oestrogéniques). L’usage de produits à base de graine ou d’huile essentielle de fenouil est déconseillé pendant la grossesse et l’allaitement. En cas de doute, demandez l’avis d’un médecin ou d’un pharmacien.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );

        sqLiteHelper.insertData(
                "Fenugrec",
                "fenugrec",
                "Nom latin: Trigonella foenum-graecum. \n",
                "Famille: Fabacées. \n",
                "Type:Feuille.",
                "Propriétés: \n" +
                        "Riche en substances mucilagineuses, le fenugrec a des propriétés toniques, hypotensives et diurétiques. Selon une étude publiée en 2003 (1), il pourrait réduire la glycémie, le taux de mauvais cholestérol et de triglycérides des personnes diabétiques. Le fenugrec contient des glucides et des protides qui aident à lutter contre l’amaigrissement. Sur la peau, il stoppe les inflammations cutanées.\n",
                "Parties utilisées :Les graines.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre l’amaigrissement, l’anorexie\n" +
                        "Poudre : Verser 2g de poudre de fenugrec dans un verre d’eau. Boire 3 verres par jour. Ou Extrait fluide ou teinture-mère : verser 30 gouttes dans un verre d’eau, boire 3 verres par jour. Ou extrait sec en comprimés : 500mg, 4 fois par jour. Ou sirop : 1 cuillère à café 3 fois par jour.\n" +
                        "En usage externe :\n" +
                        "Contre les inflammations cutanées\n" +
                        "Cataplasme de poudre : 4 cuillères à soupe rases de graines en poudre. Ajouter un peu d’eau chaude pour obtenir une pâte. Après avoir vérifié la température, appliquer en cataplasme sur les parties affectées. Remplacer toutes les 3 à 4 heures.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Le fenugrec est contre-indiqué pendant la grossesse (risque de contractions), l’allaitement et l’enfance. Il ne faut pas le prendre en cas de diabète (risque d’hypoglycémie). En usage externe, il y a des risques d’allergies cutanées. N’hésitez pas à demander l’avis d’un médecin ou d’un pharmacien.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Feve Des Marais",
                "fevedesmarais",
                "Nom latin:  Vicia faba.",
                "Famille: Fabacées.",
                "Type:Fruit/Légume.",
                ": Propriétés :\n" +
                        "La fève des marais est convoitée en phytothérapie pour son action diurétique (elle améliore le fonctionnement de l’appareil urinaire). Elle est indiquée par voie interne pour traiter les infections urinaires, les crises de goutte, les maladies rhumatismales, les cystites (inflammations de la vessie), les lombalgies (sciatiques), les coliques néphrétiques et hépatiques. Cette plante apaise également les douleurs qui se déclarent au sein des voies urinaires et hépatiques (effet sédatif). Elle est souvent recommandée dans les régimes alimentaires en raison de sa teneur en vitamines B et C, en fer, en magnésium, en potassium et en antioxydants. Elle est également riche en fibres, ce qui lui permet de réguler le transit intestinal et de lutter contre le diabète.\n",
                "Parties utilisées :Les fleurs et les gousses.",
                "Posologie :\n" +
                        "En usage interne \n" +
                        "Contre les lombalgies et les coliques néphrétiques. \n" +
                        "Infusion : Faire bouillir 30 g de fleurs dans 1 litre d’eau. \n" +
                        " Boire 3 tasses par jour en dehors des repas. \n" +
                        "Contre les lombalgies, les rhumatismes et les affections urinaires. \n" +
                        "Décoction : Plonger les fleurs dans de l’eau froide. Faire bouillir entre 30 et 60 g dans 1 litre d’eau. Boire 3 tasses par jour en dehors des repas. \n" +
                        "Contre les cystites. \n" +
                        "Sirop : Mélanger 15 g d’extrait fluide de gousses de fève de marais, 5 g d’extrait mou de stigmates de maïs et 400 ml de sirop des cinq racines. \n" +
                        "Prendre 2 à 3 cuillères à soupe par jour. Ou extrait fluide (gousses) : 1 à 2 g par jour.\n",
                "Précautions d'emploi :\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Ficaire",
                "ficaire",
                "Nom latin: Ranunculus ficaria.",
                "Famille: Renonculacées.",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "La ficaire est une plante utilisée pour soigner les troubles circulatoires, en particulier les hémorroïdes. Elle est appréciée pour ses propriétés vasoconstrictrices qui lui permettent de favoriser la diminution du calibre des vaisseaux sanguins, facilitant ainsi la cicatrisation. Cet effet vasoconstricteur se doit à la présence de protoanéimonine, une substance irritante. Elle est aussi indiquée pour traiter les jambes lourdes et les chevilles enflées. Les médicaments élaborés à base de ficaire sont commercialisés sous forme de crème, de pommade ou en suppositoires.\n",
                "Parties utilisées :Les racines et les feuilles.\n",
                "Posologie:\n" +
                        "En usage externe :\n" +
                        "Contre les hémorroïdes. Crème, pommade ou suppositoires (10% d’extrait de ficaire) : 2 applications par jour sur les zones affectées.\n",
                "Précautions d'emploi :\n" +
                        "La protoanéimonine présente dans la ficaire a une action irritante. Un simple contact avec la peau peut provoquer des démangeaisons ou des allergies. C’est la raison pour laquelle cette plante est uniquement recommandée en usage externe. Au début du traitement, il est préférable d’appliquer le produit sur une petite surface de la peau afin de prévenir les éventuels effets indésirables. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Figuier",
                "figuier",
                "Nom latin: Ficus carica.",
                "Famille: Moracées.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Le fruit (figue) et les feuilles du figuier ont des propriétés digestives et drainantes. On leur connaît également des vertus anti-inflammatoires, émollientes, calmantes et expectorantes. On les utilise en cas d’encombrement respiratoire, de toux, de gastrites ou de troubles digestifs (constipation par exemple). Les feuilles de l'arbre ont également des propriétés antidiabétiques.\n",
                "Parties utilisées :\n" +
                        "La figue et les feuilles.\n",
                "Posologie :\n" +
                        "En usage interne :\n" +
                        "Contre l’encombrement des voies respiratoires\n" +
                        "En teinture-mère : verser 50 gouttes dans un verre d’eau, 2 fois par jour jusqu’à amélioration des symptômes. Ou en décoction : Laisser macérer 80 à 100g de figues sèches dans un litre d’eau bouillante durant 20 minutes. Filtrer et boire tout au long de la journée, jusqu’à amélioration des symptômes.\n" +
                        "Contre les gastrites\n" +
                        "Macérat glycériné de bourgeons : Boire 75 gouttes dans un verre d’eau, matin et soir, jusqu’à amélioration des symptômes.\n" +
                        "En usage externe :\n" +
                        "Contre la toux,\n" +
                        "Gargarisme : Laisser macérer 80 à 100g de figue sèches dans un litre d’eau bouillante durant 20 minutes. Filtrer. Faire 2 gargarismes par jour avec cette décoction, jusqu’à amélioration des symptômes.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Le figuier ne présente aucun risque connu, aux doses recommandées. Attention toutefois à son effet laxatif.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Fougère",
                "fougere",
                "Nom latin: Dryopteris filix-mas.",
                "Famille: Dryoptéridacées.",
                "Type:Feuille.",
                "Propriétés :\n" +
                        "La fougère mâle est une plante utilisée en médecine pour sa propriété anthelminthique (elle aide à lutter contre les vers parasites). Elle est essentiellement recommandée en usage interne aux patients atteints d’une maladie intestinale provoquée par un parasite. Elle est notamment efficace contre les ténias, les douves, les oxyures et l’ascaris. La fougère mâle est aussi parfois indiquée dans le traitement de la goutte, des rhumatismes et des maux de tête.\n",
                "Parties utilisées :\n" +
                        "Les feuilles et les racines.\n",
                "Posologie\n" +
                        "En usage interne: la plante s'utilise en décoction, en infusion, en extrait sous forme de capsules, en poudre, en formule pour vermifuge.\n" +
                        "En usage externe:\n" +
                        "Contre la goutte.\n" +
                        "Décoction et bains de pieds.\n" +
                        "Contre les rhumatismes et les maux de tête. Bains entiers.\n",
                "Précautions d'emploi :\n" +
                        "La fougère mâle est contre-indiquée chez les personnes qui souffrent d’une maladie cardiaque, hépatique ou intestinale, ainsi que chez les femmes enceintes ou qui allaitent. Elle est déconseillée aux patients âgés de moins de 15 ans. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Fragon Epineux",
                "fragonepineux",
                "Nom latin: Ruscus aculeatus.",
                "Famille: Liliacées.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Le fragon est un veinotonique. Une étude menée sur 148 personnes souffrant d'insuffisance veineuse a démontré que sa prise pouvait réduire la sensation de jambes lourdes et les gonflements (1). Le fragon est ainsi employé pour soulager les jambes lourdes, les varices, les hémorroïdes (2), les crampes, les œdèmes (3) et le syndrome prémenstruel\n",
                "Parties utilisées :\n" +
                        "Le rhizome et la racine.\n",
                "Posologie :\n" +
                        "En usage interne :\n" +
                        "Contre le syndrome prémenstruel, les jambes lourdes, les varices, les hémorroïdes, les crampes et les œdèmes\n" +
                        "Gélules de 50 mg de poudre : à prendre 3 fois par jour avec un verre d’eau, au moment des repas. Ou extraits en ampoules buvables : 2 ou 3 par jour, diluées dans un verre d’eau, au moment des repas.\n" +
                        "En usage externe :\n" +
                        "Contre les hémorroïdes\n" +
                        "Pommade rectale : appliquer localement une fois par jour.\n" +
                        "Contre les jambes lourdes et les varices\n" +
                        "Crèmes : appliquer sur les jambes une fois par jour. Masser en remontant des chevilles aux cuisses.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Le fragon épineux ne présente aucun risque connu à ce jour, aux doses recommandées.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );

        sqLiteHelper.insertData(
                "Fraisier",
                "fraisier",
                "Nom latin: Fragaria vesca.",
                "Famille: Rosacée.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Le fraisier a de nombreuses propriétés. Il aide au bon fonctionnement de l’appareil digestif. Il soigne les diarrhées et prévient des hémorragies intestinales. Grâce à son effet diurétique, le fraisier soulage les voies urinaires d’infection comme les cystites ou les lithiases urinaires. C’est un régulateur hépatique qui soigne également l’ictère. On peut utiliser cette plante pour combattre les maladies respiratoires comme l’asthme et l’angine. Le fraisier aide également à prévenir des rhumatismes.\n",
                "Parties utilisées :\n" +
                        "Les feuilles et les racines\n",
                "Posologie :\n" +
                        "En usage interne :\n" +
                        "Pour soigner les diarrhées, les ictères et les coliques néphrétiques : plonger une poignée de feuilles dans un demi litre d’eau.\n" +
                        "Pour soigner l’arthrite, l’artériosclérose, l’hypertension et les infections urinaires : faire bouillir une poignée de feuilles et de racines coupées dans 1 litre d’eau. Laisser infuser 10 minutes.\n" +
                        "Zn usage externe :\n" +
                        "Pour soigner les angines : utiliser la décoction de feuilles en gargarisme.\n",
                "Précautions d'emploi :\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées. Demander conseil à votre médecin.\n"
        );
        sqLiteHelper.insertData(
                "Framboisier",
                "framboisier",
                "Nom latin: Rubus idaeus.",
                "Famille: Rosacée.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Le framboisier a des vertus agissant sur le système digestif, il réduit la constipation. Etant diurétiques, les feuilles de framboisier luttent contre les affections rénales. La plante peut être également utilisée pour soigner les infections du système respiratoire comme les angines ou les bronchites.\n",
                "Parties utilisées :Les feuilles\n",
                "Posologie :\n" +
                        "Usage interne :\n" +
                        "Laisser infuser trois feuilles de framboisier dans une tasse d’eau chaude pendant 10 minutes. Boire trois tasses par jour.\n" +
                        "Usage externe en gargarisme pour soigner une angine ou une stomatite\n" +
                        "Faire une poignée de feuilles de framboisier dans un litre d’eau pendant 10 minutes.\n",
                "Précautions d'emploi :\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées. Demander conseil à son médecin.\n"

        );
        sqLiteHelper.insertData(
                "Fraxinelle",
                "fraxinelle",
                "Nom latin: Dictamnus albus.",
                "Famille: Rutacées.",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "La fraxinelle intéresse les phytothérapeutes pour les bienfaits thérapeutiques de ses feuilles et de son écorce. Les feuilles ont des propriétés stomachiques (elles favorisent le transit intestinal) et vermifuges (elles luttent contre les vers et les parasites qui colonisent l’appareil digestif). Elles sont indiquées dans la prise en charge des maladies intestinales d’origine parasitaire et des digestions difficiles. Grâce à son action tonique, l’écorce de la fraxinelle agit efficacement contre la grande fatigue (asthénie). Elle est aussi employée pour traiter l’anémie.\n",
                "Parties utilisées :Les feuilles et l’écorce.",
                "Posologie:\n" +
                        "En usage interne :\n" +
                        "Infusion à base de feuilles : Faire bouillir 20 g dans 1 litre d’eau. \n" +
                        "Boire 3 tasses par jour. \n" +
                        "Ou \n" +
                        "Infusion à base d’écorce : Faire bouillir 40 g dans 1 litre d’eau pendant 2 minutes. Laisser infuser 10 minutes. \n" +
                        "Boire 3 tasses par jour.\n" +
                        "En cas de doute sur la posologie, demander conseil à un médecin ou pharmacien spécialisé en phytothérapie.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Frene",
                "frene",
                "Nom latin: Fraxinus excelsior.",
                "Famille: Oléacées.",
                "Type:Feuille.",
                "Propriétés :\n" +
                        "Le frêne possède une action anti-inflammatoire sur les rhumatismes qui a été prouvée dans une étude menée sur des animaux (1). Il est aussi utilisé comme diurétique et contre la rétention d’eau. Son écorce aide à faire baisser la fièvre.\n",
                "Parties utilisées :Les feuilles et l’écorce",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre la lithiase rénale, les rhumatismes, les crises de goutte, les œdèmes, la rétention d’eau et l’obésité\n" +
                        "Infusion : Laisser infuser 10 à 20g de feuilles séchées dans un litre d’eau bouillante, durant 10 minutes. Filtrer. Boire un demi à un litre par jour. Ou gélules dosées à 300mg de poudre : 2 le matin, à midi et le soir avec un verre d’eau.\n" +
                        "Contre la fièvre\n" +
                        "Teinture-mère : 50 gouttes dans un verre d’eau. A boire 3 fois par jour. Ou\n" +
                        "Décoction : plonger 50g d’écorce séchée dans un litre d’eau bouillante. Laisser bouillir 10 minutes avant de filtrer. Boire 3 à 4 tasses par jour jusqu’à ce que la fièvre diminue.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Le frêne élevé ne présente aucun risque connu à ce jour, aux doses recommandées.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Fumeterre",
                "fumeterre",
                "Nom latin: Fumaria officinalis.",
                "Famille: Fumariacées.",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "La fumeterre régule le flux biliaire et est dépurative, d’où son utilisation contre les troubles gastriques (nausée, constipation légère…). Sédative, elle peut être conseillée en cas de troubles du rythme cardiaque, d’hypertension artérielle, d’anxiété et d’asthme. Enfin, en usage externe, elle peut favoriser la guérison d’eczéma, de dartres et de psoriasis.\n",
                "Parties utilisées :Sommités fleuries.",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les troubles gastro-intestinaux ou d’origine biliaire, les troubles du rythme cardiaque, l’hypertension artérielle, l’asthme\n" +
                        "Infusion : 2 cuillères à café de sommités fleuries pour 15 cl d’eau bouillante, laisser infuser 10 min et filtrer. Boire une tasse 30 min avant les repas, et en cas de crise douloureuse, entre les repas.\n" +
                        "Ou\n" +
                        "Teinture : 30 à 50 goutes dans un verre d’eau, 30 min avant les repas.\n" +
                        "Ou\n" +
                        "Gélules dosées à 400 mg de poudre : 3 à 6 par jour avec un grand verre d’eau.\n" +
                        "Ou\n" +
                        "Gélules dosées à 250 mg d’extrait sec: 3 à 4 par jour avec un verre d’eau.\n" +
                        "En usage externe\n" +
                        "Contre le psoriasis, l’eczéma, les dartres\n" +
                        "Compresses : imbiber un linge de l’infusion mentionnée ci-dessus, appliquer 2 ou 3 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "La fumeterre ne présente aucune contre-indication, aux doses recommandées.\n" +
                        "\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );

        sqLiteHelper.insertData(
                "Gattilier",
                "gattilier",
                "Nom latin: Vitex agnus-castus.\n",
                "Famille: Verbénacées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Le gattilier est un régulateur hormonal. On l’utilise chez la femme pour traiter les troubles hormonaux: syndrome prémenstruel (1) avec rétention d’eau, absence ou règles irrégulières et douleurs des seins (2).\n" ,
                "Parties utilisées :\n" +
                        "Les baies.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre l’insuffisance de corps jaune : le syndrome prémenstruel, l’absence de règles, la stérilité, les douleurs des seins.\n" +
                        "Gélules dosées à 250 mg d’extrait sec : 2 le matin et 2 le soir avec un verre d’eau.\n" +
                        "Ou\n" +
                        "Extrait fluide : 100 gouttes par jour dans un verre d’eau.\n" +
                        "Ou\n" +
                        "Extrait alcoolique 1/5 : 50 gouttes au coucher.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n" ,
                " Précautions d'emploi :\n" +
                        "Le gattilier doit être utilisé sous le contrôle d’un médecin. L’Agence européenne du médicament recommande de ne pas le prendre sur plus de trois cycles menstruels consécutifs. Sa consommation est contre-indiquée chez les personnes ayant eu un cancer du sein ou étant à risque (antécédents familiaux), en cas de troubles de l’hypophyse (sauf avis médical), de grossesse, d’allaitement, pendant une fertilisation in vitro, et chez les personnes de moins de 18 ans.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Genévrier",
                "genevrier",
                "Nom latin: Juniperus communis.\n",
                "Famille: Cupressacées.",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "En usage interne, on utilise le genévrier contre les troubles de la digestion et les troubles urinaires. A faible dose, les baies traitent les dyspepsies (maux d'estomac), la perte d'appétit ou encore les flatulences. En usage externe, son huile essentielle soulage les rhumatismes et les névralgies.\n" ,
                "Parties utilisées :\n" +
                        "Les baies.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les troubles urinaires\n" +
                        "Décoction : Plonger 10g de baie dans 75cl d’eau, porter à ébullition et laisser bouillir 20 minutes. Filtrer. Boire 2 ou 3 tasses par jour, pendant 3 semaines au maximum.\n" +
                        "Contre la dyspepsie\n" +
                        "Infusion : 0,5 à 2g de baies écrasées pour une tasse d’eau bouillante. Laisser infuser 10 minutes et filtrer. Boire une tasse 15 minutes avant les repas, pendant 3 semaines au maximum.\n" +
                        "Ou\n" +
                        "Teinture : Diluer 10 à 20 gouttes dans un petit verre d’eau sucrée, à boire 3 fois par jour, pendant 3 semaines au maximum.\n" +
                        "En usage externe\n" +
                        "Contre les rhumatismes, les névralgies, les tendinites et les myalgies\n" +
                        "Infusion : 10 à 20 cl dans l’eau du bain.\n" +
                        "Ou\n" +
                        "Huile essentielle : diluée à 3 à 5% dans une huile végétale. En friction 2 à 3 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n" ,
                " Précautions d'emploi :\n" +
                        "Les traitements aux baies de genévrier sont contre-indiqués aux femmes enceintes, allaitantes, aux personnes de moins de 18 ans, en cas de maladies des reins (néphrite, pyélonéphrite, insuffisance rénale…) et d’inflammation aiguë des voies urinaires. Un usage de plus de 6 semaines ou un surdosage peuvent entrainer diverses complications : troubles de la miction, albuminurie et douleurs rénales. Demandez l’avis d’un médecin avant toute prise.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Géranium (Rosat, Robert)",
                "geranium",
                "Nom latin: Geranium robertianum, Pelargonium roseum.\n",
                "Famille: Géraniacées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "- L’huile essentielle de géranium possède des propriétés anti-inflammatoires, antibactériennes, antifongiques, antispasmodiques (elle prévient les contractions musculaires involontaires) et antioxydantes (elles ralentissent le vieillissement des cellules). En phytothérapie, le géranium Robert et le géranium rosat sont utilisés pour traiter le diabète, les diarrhées, les hémorragies, les maux de gorge et les lésions cutanées (rosacée, fissures anales, cicatrices). On les emploie également pour protéger le cuir chevelu et prévenir les piqûres de moustiques.\n" ,
                "Parties utilisées :\n" +
                        "- Les tiges et les feuilles.\n\n",
                "Posologie :\n" +
                        "- En usage interne \n" +
                        "Contre le diabète. \n" +
                        "Infusion : Mélanger 50 g de géranium Robert (tiges et feuilles), d’aigremoine (tiges et feuilles), d’olivier (feuilles), d’ortie piquante (feuilles) et de myrtilles (feuilles). Faire bouillir 1 cuillère à soupe du mélange pour 1 tasse d’eau pendant 3 minutes. Laisser infuser 10 minutes. \n" +
                        "Boire 2 à 3 tasses par jour. \n" +
                        "En usage externe \n" +
                        "Pour activer la microcirculation du cuir chevelu. \n" +
                        "Massage : Mélanger 5 ml d’huile essentielle de géranium, de genévrier, de cyprès, de romarin et d’ylang-ylang dans 100 ml d’huile d’amande douce. Appliquer sur le cuir chevelu et masser environ une heure avant de faire un shampoing. Réaliser 1 massage par semaine pendant 3 mois. \n" +
                        "Pour traiter les fissures anales. \n" +
                        "Massage : Mélanger 50 gouttes d’huile essentielle de géranium rosat, d’arbre à thé, de lavande et d’hélichryse dans 50 ml d’huile de millepertuis. Appliquer sur la lésion après les selles et masser doucement (3 fois par jour). \n" +
                        "Pour atténuer les cicatrices. \n" +
                        "Massage : Mélanger 5 ml d’huile essentielle de géranium rosat, d’arbre à thé et de lavande dans 100 ml d’huile de rosier muscat. Appliquer sur la cicatrice. Masser profondément sur et autour de la lésion. Masser doucement si la cicatrice résulte d’une opération qui a été réalisée il y a moins d’un mois. Répéter les massages jusqu’à l’amélioration de l’apparence de la cicatrice. \n" +
                        "Pour traiter la rosacée. \n" +
                        "Huile de soin : Mélanger 50 gouttes de ciste, 50 gouttes d’arbre à thé, 30 gouttes de géranium rosat, 30 gouttes de cyprès et 30 gouttes d’hélichryse dans 100 ml d’huile de calendula ou de souci. Appliquer directement sur les lésions 2 fois par jour (matin et soir). \n" +
                        "Pour prévenir les piqûres de moustiques. \n" +
                        "Application locale : Appliquer de l’huile essentielle de géranium rosat sur les parties du corps exposées aux piqûres (bras, jambes, cou).\n" ,
                " Précautions d'emploi :\n" +
                        "- Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Gingembre",
                "gingembre",
                "Nom latin: Zingiber officinale.\n",
                "Famille:Zingibéracées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Le gingembre agit de façon sédative sur l’estomac. C’est pourquoi il réduit les nausées et vomissements, par exemple en cas de mal des transports, de grossesse ou d’interventions chirurgicales (1). Le gingembre possède également des vertus contre l’insuffisance biliaire et pancréatique (2), et les rhumatismes (en usage externe) (3). Son rhizome contient des substances analgésiques qui diminuent la fièvre.\n" +
                        "L’OMS reconnaît ainsi son usage dans le traitement du rhume, de la grippe et des migraines. L'extrait aqueux de la plante permet aussi de faire baisser le taux de mauvais cholestérol, de triglycérides, d'acides gras du sang, de phospholipides, et ainsi de lutter contre les maladies cardiovasculaires (4).\n" ,
                "Parties utilisées :\n" +
                        "Le rhizome.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les gastrites, les nausées, les vomissements, l’insuffisance biliaire et pancréatique\n" +
                        "Poudre de rhizome : 0,5 à 1,5g par jour.\n" +
                        "Ou\n" +
                        "Extrait fluide : 0,6 à 1,8g par jour dans un verre d’eau.\n" +
                        "Ou\n" +
                        "Teinture-mère : 60 à 100 gouttes par jour dans un verre d’eau.\n" +
                        "En usage externe\n" +
                        "Contre les rhumatismes\n" +
                        "Crème à base de poudre de rhizome ou d’huile essentielle : en application locale, 2 ou 3 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n" ,
                "Précautions d'emploi :\n" +
                        "La prise de gingembre est contre-indiquée en cas d’obstruction des voies biliaires (calculs) et chez les enfants de moins de 6 ans. Le surdosage peut entraîner des troubles importants de la digestion. En cas de grossesse ou d’allaitement, demandez conseil à un médecin ou à un pharmacien avant toute prise.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Ginkgo",
                "ginko",
                "Nom latin: Ginkgo biloba .\n",
                "Famille: Ginkgoacées.\n",
                "Type:Feuille.",
                "Propriétés :\n" +
                        "Le ginkgo augmente le tonus des veines et l’irrigation cérébrale. Il lutte contre les symptômes de l’insuffisance vasculaire cérébrale, les vertiges et le déclin cognitif (troubles de la mémoire, difficulté d’attention…). Selon une étude menée sur 400 sujets souffrant de démences, la prise de 240 mg d'extrait de ginkgo par jour améliorerait les fonctions cognitives, la dépression et l’anxiété (1). Enfin, l’OMS reconnaît l’usage du ginkgo pour améliorer la marche dans la claudication intermittente ou après une phlébite ainsi que pour soulager les acouphènes d’origine circulatoire.\n" ,
                "Parties utilisées :\n" +
                        "La feuille.\n" ,
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre l’insuffisance vasculaire cérébrale\n" +
                        "Teinture-mère : 100 gouttes diluées dans un verre d’eau, 2 fois par jour.\n" +
                        "Contre les pertes de mémoire, les vertiges\n" +
                        "Extrait sec : 50 à 100 mg, 3 fois par jour avant les repas.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n" +
                        "Le ginkgo peut provoquer des maux de tête et des troubles de la digestion sans gravité (à condition de respecter la posologie). Sa prise est interdite aux moins de 18 ans, aux femmes enceintes ou allaitantes, aux hémophiles, aux personnes prenant des médicaments anticoagulants et avant toute intervention chirurgicale (il faut arrêter au moins de 48h avant). Demandez l’avis de votre médecin ou de votre pharmacien avant toute prise.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Giroflée",
                "girofle",
                "Nom latin: Cheiranthus cheiri.\n",
                "Famille: Brassicacées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Grâce à son action tonicardiaque, la giroflée renforce les contractions du cœur. Cette plante est aussi appréciée pour ses propriétés diurétiques. Elle contribue à améliorer le fonctionnement de l’appareil urinaire, notamment des reins. Ses fleurs sont utilisées pour traiter l’anxiété, certaines maladies nerveuses et les oliguries (diminution du volume des urines). Ses graines sont indiquées dans la prise en charge des diarrhées et des dysenteries (infections d’origine bactérienne ou parasitaire caractérisées par des diarrhées et la présence de sang dans les selles).\n" ,
                "Parties utilisées :\n" +
                        "Les fleurs et les graines.\n",
                "Posologie :\n"+
                        "Les bienfaits et vertus de la baie de goji pour plus de vitamine C.\n" +
                        "Contre la constipation les propriétés de huile de ricin est très conseillé.\n" +
                        "Les vertus de l’aubépine pour les sujets présentant une tension artérielle en dessous de la normale.\n" +
                        "Pour une meilleure circulation sanguine et pour renforcer le système immunitaire les vertus de l’ail en gélules ou du ginseng pour équilibrer les fonctions cardiaques et sanguines." ,
                "Précautions d 'emploi :\n" +
                        "Les fleurs de la giroflée sont toxiques. Leur usage est strictement médicinal. Elles ne doivent pas être utilisées à des fins aromatiques ou culinaires. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Giroflier",
                "giroflier",
                "Nom latin: Syzygium aromaticum (Eugenia caryophyllata).\n",
                "Famille:Myrtacées .\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n"+
                        "Riche en eugénol, le clou de girofle est antioxydant, anti-inflammatoire, antibactérien, antifongique et analgésique. On l’utilise contre les troubles digestifs, les douleurs dentaires et arthrosiques. Ses vertus digestives, purgatives et anti ulcéreuses ont été prouvées sur des animaux en 2008 (1)." ,
                "Parties utilisées:\n"+
                        "Le clou de girofle.",
                "Posologie :\n"+
                        "En usage interne\n" +
                        "Contre les gastrites, les dyspepsies et les douleurs rhumatismales\n" +
                        "Clous de girofle : 1 à 3 g par jour en décoction.\n" +
                        "Contre les maux de dents\n" +
                        "Clous de girofle : mastiquer un clou 3 ou 4 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "L’huile essentielle de giroflier doit être employée avec précaution car elle attaque les muqueuses. Ne pas l’utiliser sans avis médical.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Globulaire",
                "globulaire",
                "Nom latin: Globularia alypum.\n",
                "Famille: Globularicées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Appréciée pour son effet purgatif, la globulaire permet de traiter les constipations légères. Cette plante est aussi utilisée pour son action cholagogue (elle favorise la sécrétion de bile) et astringente (elle accélère la cicatrisation des plaies). Elle est parfois indiquée dans la prise en charge des arthrites, des crises de goutte et des hémorragies internes (poumons, appareil digestif). Cette plante est souvent confondue avec la globulaire vulgaire ( Globularia vulgaris) qui possède les mêmes propriétés.",
                "Parties utilisées: Les feuilles.\n",
                "Posologie :\n"+
                        "En usage interne \n" +
                        "Décoction : Plonger les feuilles dans de l’eau froide. Faire bouillir 40 g pour 1 litre d’eau et laisser infuser 10 minutes. \n" +
                        "Boire 2 tasses par jour.\n" +
                        "En cas de doute sur la posologie, demander conseil à un médecin ou pharmacien spécialisé en phytothérapie.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"
                        +" Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Grenadier",
                "grenadier",
                "Nom latin: Punica granatum.\n",
                "Famille: Punicacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n"+
                        "Le grenadier est apprécié pour ses propriétés astringentes (il assèche les tissus et facilite la cicatrisation). L’écorce de sa racine et ses fleurs sont utilisées pour traiter les diarrhées, les dysenteries, les maladies intestinales provoquées par les parasites (ténia, ascaris), les métrorragies (saignements en dehors des règles) et les leucorrhées (pertes blanches). Le grenadier est aussi indiqué en cas d’hypertension, pour prévenir les maladies cardiovasculaires et chez les personnes qui ont un taux élevé de cholestérol. Le grenadier est apprécié pour ses propriétés astringentes (il assèche les tissus et facilite la cicatrisation). L’écorce de sa racine et ses fleurs sont utilisées pour traiter les diarrhées, les dysenteries, les maladies intestinales provoquées par les parasites (ténia, ascaris), les métrorragies (saignements en dehors des règles) et les leucorrhées (pertes blanches). Le grenadier est aussi indiqué en cas d’hypertension, pour prévenir les maladies cardiovasculaires et chez les personnes qui ont un taux élevé de cholestérol." ,
                "Parties utilisées: L’écorce des racines, les fleurs et le jus des fruits.\n",
                "Posologie :\n"+
                        "En usage interne, la plante s'utilise en décoction ou sous forme d'extrait alcoolique.\n" +
                        "Dosage : demander conseil à un médecin ou pharmacien spécialisé.\n" +
                        "Contre les maladies intestinales d’origine parasitaire. Potion ténifuge : 20 g d’extrait alcoolique de racine de grenadier, 140 g d’eau, 10 g d’hydrolat de menthe et 30 g de sirop.\n" +
                        "En usage externe\n" +
                        "Contre les métrorragies et les leucorrhées. Fleurs en décoction : Faire bouillir 30 g de fleurs pour 1 litre d’eau. Laisser infuser pendant 10 minutes.\n" +
                        "A administrer en injections vaginales.\n" ,
                " Précautions d'emploi :\n"+
                        "La pelletiérine, une des substances actives du grenadier, est susceptible d’entraîner de graves intoxications. Cette plante est contre-indiquée pendant la grossesse, l’allaitement, chez les enfants de moins de 5 ans et en cas de dépression. Attention : Les plantes ne sont pas des remèdes anodins.\n" +
                        "Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Guimauve",
                "guimauve",
                "Nom latin: Althaea officinalis.\n",
                "Famille: Malvacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "La guimauve est la plante adoucissante par excellence. Elle a des propriétés sédatives et calmantes. Elle est donc idéale pour apaiser les toux sèches, liées à des laryngites ou à des bronchites. Ses propriétés antitussives ont été prouvées par une étude slovaque de 2007, menée sur des animaux (1). Elles sont attribuées aux polysaccharides contenues dans la plante. En usage externe, la guimauve est utilisée pour traiter les inflammations de la bouche, les abcès dentaires, les furoncles et l’acné.",
                "Parties utilisées: La racine.\n",
                "Posologie :\n"+
                        "En usage interne\n" +
                        "Contre les toux liées à la laryngite, à la trachéite ou à la bronchite\n" +
                        "Infusion : 10g de racine séchée pour 1 litre d’eau bouillante. Laisser infuser 10 minutes avant de filtrer. Boire 2 tasses par jour.\n" +
                        "Ou\n" +
                        "Poudre, extrait sec : 6g par jour.\n" +
                        "En usage externe\n" +
                        "Contre les inflammations de la bouche, les abcès dentaires, les furoncles, l’acné\n" +
                        "Compresses : Imbiber un linge d’infusion (10g de racine séchée pour 1 litre d’eau bouillante. Infuser 10 min et filtrer) et l’appliquer plusieurs fois par jour sur la zone.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "Aux doses recommandées, la guimauve ne présente pas de risque. Elle peut cependant avoir des interactions dangereuses quand elle est associée à certains médicaments, à de l’alcool, à des tanins ou à du fer. Elle est contre-indiquée aux femmes enceintes, allaitantes et chez les enfants de moins de 3 ans. Demander l’avis d’un médecin avant toute prise.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Hamamélis",
                "hamamelis",
                "Nom latin: Hamamélis virginiana.\n",
                "Famille: Hamamélidacées.\n",
                "Type:Feuille.",
                "Propriétés :\n"+
                        "Grâce aux flavonoïdes et aux tanins qu’il contient, l’hamamélis augmente la résistance des veines et diminue la perméabilité des vaisseaux (contre les œdèmes, les jambes lourdes). Il prévient aussi les varicosités disgracieuses et est efficace contre l’herpès labial et l’eczéma.",
                "Parties utilisées: La feuille.\n",
                "Posologie :\n" +
                        "En usage interne:\n" +
                        "Contre l’insuffisance veineuse, les hémorroïdes \n" +
                        "Infusion : 10 g pour un litre d’eau. Laisser infuser 5 à 10 min. Filtrer. 1 à 2 tasses par jour pendant 6 à 12 mois. \n" +
                        "Ou \n" +
                        "Gélules dosées à 290 mg de poudre : 1 ou 2 matin, midi, et soir, pendant 6 à 12 mois. \n" +
                        "Ou \n" +
                        "Extrait sec : 1 sachet-dose par jour dans un verre d’eau. \n" +
                        "Ou \n" +
                        "Extrait fluide : 2 à 6 g par jour dans un verre d’eau. \n" +
                        "Ou \n" +
                        "Teinture-mère : 50 à 100 gouttes par jour dans un verre d’eau.\n" +
                        "Pour l’hygiène buccale \n" +
                        "Infusion : 10 g pour un litre d’eau bouillante. Laisser infuser 5 à 10 min. Se rincer la bouche, puis avaler. 1 à 2 tasses par jour.\n" +
                        "En usage externe\n" +
                        "Contre l’insuffisance veineuse, hémorroïdes \n" +
                        "Gel ou pommade : en massage léger, 1 fois par jour.\n" +
                        "En cas de persistance des symptômes consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "La plante n’a pas présenté à ce jour d’effet toxique, mais elle peut provoquer des allergies de contact. Elle reste cependant contre-indiquée chez l’enfant de moins de 6 ans et la femme enceinte ou allaitante.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Henné",
                "henne",
                "Nom latin: Lawsonia inermis.\n",
                "Famille: Lythracées.\n",
                "Type:Plante.",
                "Propriétés :\n" +
                        "Le henné contient de la lawsone, un pigment qui possède une grande propriété antifongique (il lutte contre les infections provoquées par les champignons). Ses feuilles ont aussi un effet anti-inflammatoire, antibactérien, antiparasitaire, diurétique (elles améliorent le fonctionnement de l’appareil urinaire), astringent (elles assèchent les tissus et accélèrent la cicatrisation) et antiseptique (elles désinfectent les plaies). Le henné est principalement utilisé pour prendre en charge les troubles gastro-intestinaux tels que les diarrhées et les ulcères de l’estomac. Il est aussi employé en usage externe pour traiter la chute des cheveux, les abcès et certaines affections cutanées (eczéma, gale, mycoses).",
                "Parties utilisées:Les feuilles séchées.\n",
                "Posologie :\n"+
                        "On prépare 50-100 grammes de henné (henné naturel, uniquement du lawsonia inermis dans la composition !!)\n" +
                        "On fait infuser 3 cuiller à soupe de fleurs séchées d’hibiscus dans l’équivalent de deux verres d’eau pour que cela soit bien concentre\n" +
                        "On récupère les fleurs infusées, on prend encore 2 cuiller à soupe de fleurs séchées et on mixe le tout\n" +
                        "Une fois la pâte d’hibiscus bien mixée, on la mêle au henné\n" +
                        "On rajoute lentement l’infusion encore chaude jusqu’à obtenir une pâte lisse mais ferme\n" +
                        "Un petit filet de jus de citron dans la préparation n’est pas de refus pour apporter de la brillance et un résultat plus profond" ,
                " Précautions d'emploi :\n"+
                        "Le henné peut entraîner des allergies chez certaines personnes.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Immortelle",
                "immortelle",
                "Nom latin: Helichrysum italicum .\n",
                "Famille: Astéracées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "L’huile essentielle d’immortelle contient de l’acétate de néryle, une substance appréciée pour propriétés anti-inflammatoires, antalgiques (elle apaise les douleurs), cicatrisantes et décongestionnantes (elle dégage les voies respiratoires). Elle est utilisée en usage externe pour prendre en charge les brûlures, les hématomes, les varices, l’arthrite, les rhumatismes et certaines affections cutanées telles l’acné et la couperose. En usage interne, l’immortelle est indiquée dans la prise en charge des brûlures d’estomac, des digestions difficiles (dyspepsies). Cette plante s’administre par voie orale (infusion), inhalée ou locale (lotion, crème, huile essentielle).",
                "Parties utilisées: Les fleurs.\n",
                "Posologie :\n"+
                        "En usage interne:\n" +
                        "Permet de lutter contre la dyspepsie (en tisane) : brûlures d'estomac et autres régurgitations.\n" +
                        "En usage externe:\n" +
                        "Appliquée sous forme de crème ou d'huile essentielle, l'immortelle atténue les hématomes ou les brûlures et favorise la disparition de la couperose et des varices. En lotion, elle préserve la peau des affections acnéiques.\n" +
                        "Indications Thérapeutiques Usuelles:\n" +
                        "Dyspepsie, hématomes, troubles de la circulation, varices, affections cutanées (eczéma, acné), arthrite, rhumatismes, décongestion des voies aériennes.\n" +
                        "Autres Indications Thérapeutiques Démontrées:\n" +
                        "L'immortelle est également connue pour ses vertus cicatrisantes et antispasmodiques. Décongestionnante, l'immortelle est un antidouleur et un anti-inflammatoire." ,
                " Précautions d'emploi :L’immortelle est déconseillée pendant la grossesse, l’allaitement ou en cas d’obstruction des voies biliaires. Elle ne doit pas être administrée aux jeunes enfants ni être associée à un traitement anticoagulant.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Jalap",
                "jalap",
                "Nom latin:  Exogonium officinale, Ipomoea purga, Convolvulus jalapa.\n",
                "Famille: Convolvulacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Le jalap est convoité en phytothérapie pour sa racine. Elle a une propriété purgative (elle nettoie l’organisme et l’aide à évacuer les déchets) et vermifuge (elle combat les vers et les intestins qui colonisent l’appareil digestif). Elle favorise l’élimination de l’eau et le transit intestinal. Cette plante est surtout indiquée dans la prise en charge des hémorragies cérébrales et des hydropisies (rétentions de liquides). Elle est aussi employée pour traiter les congestions provoquées par l’interruption des règles et, plus rarement, les œdèmes d’origine cardiaque. Les bienfaits thérapeutiques de la racine de jalap se doivent à la présence de glucorésine, un principe actif que l’on retrouve dans plusieurs légumes tels que l’aubergine et la courgette. Comme la caféine, la glucorésine a un effet laxatif et contribue à combattre la constipation.",
                "Parties utilisées: La racine.\n",
                "Posologie : \n" +
                        "En usage interne: \n" +
                        "Pilules : 0,50 à 2 g par jour \n" +
                        "Ou \n" +
                        "Résine : Mélanger 80 g de jalap broyé, 20 g de scammonée et 10 g de turbith végétal dans 1 litre d’alcool à 60°. Laisser macérer pendant 10 jours tout en remuant la préparation de temps en temps. Filtrer avant de boire.\n" +
                        "En cas de doute sur la posologie, demander conseil à un médecin ou pharmacien spécialisé en phytothérapie.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n" ,
                " Précautions d'emploi :\n"+
                        "Le jalap est contre-indiqué chez les femmes enceintes ou qui allaitent, ainsi que chez les personnes atteintes d’appendicite chronique.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Jasmin",
                "jasmin",
                "Nom latin: Jasminum officinale .\n",
                "Famille: Oléacées .\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Très apprécié des amateurs de thé, le jasmin est une plante populaire aux vertus thérapeutiques reconnues. Il a un effet sédatif (il « endort » le système nerveux central et détend les muscles), antidépresseur, antiseptique (il lutte contre les infections) et antispasmodique (il prévient les contractions musculaires involontaires). Ses fleurs et son huile essentielles sont utilisées dans le traitement des maux de tête, de l’anxiété, de la dépression, des troubles du sommeil (insomnies), des spasmes, des douleurs (dorsales, musculaires, articulaires, nerveuses) et de la toux. En usage externe, le jasmin soigne les plaies et fait disparaître les crampes." ,
                "Parties utilisées: Les fleurs, l’huile essentielle extraite des fleurs.\n",
                "Posologie :\n" +
                        "En usage interne:\n"+
                        "Le jasmin est un sédatif, un antidépresseur, un spasmolytique, un antiseptique.\n" +
                        "En usage externe:\n" +
                        "Propriétés calmantes, apaisantes.\n" +
                        "Indications Thérapeutiques Usuelles:\n" +
                        "Le jasmin blanc est traditionnellement utilisé pour restaurer l'équilibre des énergies dans le traitement de la gale et du zona. Il est apprécié pour ses vertus relaxantes et sédatives. Une tisane ou un thé de jasmin officinal permet d'apaiser les tensions et de calmer les nerfs. Cette préparation est recommandée en cas d'insomnie, en particulier lors de troubles de l'endormissement. Le jasmin soigne la toux spasmodique.\n" +
                        "Autres Indications Thérapeutiques Démontrées:\n" +
                        "L'huile essentielle de jasmin aide à désinfecter les plaies. En massage, elle soulage les crampes (y compris les crampes intestinales).",
                " Précautions d'emploi : \n"+
                        "L’huile essentielle de jasmin est déconseillée aux femmes enceintes ou qui allaitent. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées."

        );
        sqLiteHelper.insertData(
                "Karkadé",
                "karkade",
                "Nom latin: Hibiscus sabdariffa .\n",
                "Famille: Malvacées .\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Riche en mucilages, le karkadé est diurétique et antispasmodique. On l'utilise pour apaiser l'inflammation des voies respiratoires, les spasmes gastro-intestinaux, lutter contre la fatigue et faciliter la prise de poids. Ses capacités anti-inflammatoires ont été évaluées par une équipe de chercheurs taïwanais en 2009 (1). Enfin, le karkadé pourrait favoriser la baisse de la tension artérielle (2). En usage externe, les fleurs traitent l'eczéma suintant et les abcès.",
                "Parties utilisées: Le calice et le calicule des fleurs.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre la fatigue, l'inflammation des voies respiratoires, les spasmes gastro-intestinaux\n" +
                        "Infusion : 1 cuillère à soupe de plante séchée pour 1 litre d'eau bouillante. Laisser infuser 10 minutes puis filtrer. Ou 1 sachet-dose dans 20 cl d'eau bouillante. Boire 1 à 3 tasses par jour.\n" +
                        "Ou\n" +
                        "Gélules dosées à 50 mg d'extrait sec : 1 ou 2 gélules, 3 fois par jour.\n" +
                        "En usage externe\n" +
                        "Contre les abcès ou eczémas suintants\n" +
                        "Compresses : 15g de fleurs séchées pour un litre d'eau bouillante. Laisser frémir durant 20 minutes. Imbiber un linge de cette décoction et appliquer sur les zoner à traiter 2 ou 3 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "Le karkadé n'est pas toxique aux doses indiquées. Toutefois, des réactions d'hypersensibilité individuelle peuvent apparaître. En cas de doute, demandez conseil à un médecin ou à un pharmacien.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Kava",
                "kava",
                "Nom latin: Piper methysticum.\n",
                "Famille: Pipéracées.\n",
                "Type:Feuille.",
                "Propriétés :\n"+
                        "Sédatif, le kava apaise les états anxieux (1) et nerveux. L’OMS reconnaît d’ailleurs son utilisation pour soulager (à court terme) l’anxiété et l’insomnie causées par la nervosité ou le stress. Il détend les muscles et calme les douleurs des menstruations.",
                "Parties utilisées: Les parties souterraines.\n",
                "Posologie :\n"+
                        "La commercialisation et l'utilisation du kava à des fins thérapeutiques est interdite en France depuis mars 2003, excepté dans les médicaments homéopathiques. Même sous cette forme, il faut demander l’avis d’un médecin avant d’en ingérer.",
                " Précautions d'emploi :\n"+
                        "La consommation de kava est contre-indiquée en cas de troubles hépatites, de maladie de Parkinson, de grossesse et d’allaitement.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Khella",
                "khella",
                "Nom latin: Ammi visnaga.\n",
                "Famille: Apiacées (Ombellifères).\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "L’huile essentielle extraite des graines de khella contient de la visnagine, un principe actif apprécié pour son effet vasodilatateur (il augmente le calibre des veines et des artères). Il favorise la dilatation des artères du cœur (les coronaires) tout en améliorant la circulation sanguine vers le muscle cardiaque, le myocarde. Pour cette raison, cette plante est très efficace dans la prévention des angines de poitrine et les infarctus du myocarde (crises cardiaques). Grâce à sa propriété antispasmodique, elle permet de traiter les contractions involontaires des bronches, des coronaires et des uretères. La khella a aussi une propriété diurétique (elle améliore le fonctionnement de l’appareil urinaire) et antiseptique (elle désinfecte les plaies). Elle permet de traiter les calculs urinaires, les douleurs rénales et les coliques néphrétiques. Elle est aussi parfois employée pour soulager les douleurs dentaires, les symptômes de certaines affections respiratoires (asthme, coqueluche) et pour réguler le système nerveux central.",
                "Parties utilisées: Les graines.\n",
                "Posologie :\n" +
                        "En usage interne \n" +
                        "Suppositoires : 100 à 200 mg de khelline par jour.\n" +
                        "En cas de doute sur la posologie, demander conseil à un médecin ou pharmacien spécialisé en phytothérapie.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Laitue Sauvage",
                "laituesauvage",
                "Nom latin: Lactuca virosa .\n",
                "Famille: Astéracées.\n",
                "Type:Feuille.",
                "Propriétés :\n"+
                        "La laitue sauvage est convoitée en phytothérapie pour son suc, un liquide blanc qui porte le nom de lactucariumet qui devient brun une fois séché au soleil. Il possède des propriétés similaires à celles du cannabis et du pavot somnifères. Il exerce une action sédative (il « endort » le système nerveux central), analgésique (il apaise les douleurs) et antispasmodique (il prévient les contractions musculaires involontaires). La laitue sauvage est indiquée dans la prise en charge de l’anxiété, des troubles du sommeil (insomnies), de la toux et des troubles digestifs (nausées, douleurs abdominales). Elle calme les personnes hyperactives et agitées. Grâce à son effet expectorant, elle agit efficacement contre les affections respiratoires comme les bronchites et la coqueluche. En usage externe, la laitue sauvage permet de soigner les verrues, ainsi que les lésions cutanées à caractère inflammatoire associées à l’acné et à l’urticaire.",
                "Parties utilisées: Le suc. Il est extrait après avoir réalisé une incision au niveau de la tige, pendant la floraison.\n",
                "Posologie : \n"+"Aucune information\n" ,
                " Précautions d'emploi :\n"+
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées."

        );
        sqLiteHelper.insertData(
                "Lamier Blanc",
                "lamierblanc",
                "Nom latin: Lamium album.\n",
                "Famille: Lamiacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Le lamier blanc est utilisé pour soulager les inflammations de la peau et des muqueuses. Il serait efficace contre les troubles urinaires et digestifs (diarrhée, flatulences, gastrites, ballonnements). Il est également prescrit en cas d'insomnie et constitue un bon remède contre la leucorrhée (pertes blanches). On peut l'utiliser en usage externe pour éliminer les pellicules et calmer les démangeaisons du cuir chevelu.",
                "Parties utilisées:Les fleurs.\n",
                "Posologie :\n"+
                        "En usage interne\n" +
                        "Contre les troubles urinaires\n" +
                        "Infusion : 2 cuillères à café de fleurs séchées pour 15 cl d'eau bouillante. Laisser infuser 5 min, filtrer, sucrer avec du miel. 3 tasses par jour.\n" +
                        "En cas de diarrhée ou d'insomnie\n" +
                        "Teinture-mère : 30 gouttes dans un verre d'eau, 3 à 6 fois par jour.\n" +
                        "Ou\n" +
                        "Poudre : jusqu'à 3 g par jour.\n" +
                        "En usage externe\n" +
                        "En cas d'inflammations de la peau et des muqueuses\n" +
                        "Compresses : 2 cuillères à café de fleurs séchées pour 10 cl d'eau bouillante. Laisser infuser 10 min. Imbiber un linge de cette infusion et appliquer 2 ou 3 fois par jour.\n" +
                        "Contre la leucorrhée\n" +
                        "Injection vaginale : 1 à 2 par jour avec l'infusion décrite en cas d'inflammation de la peau ou des muqueuses\n" +
                        "Ou\n" +
                        "Bain de siège : 3 cuillères à soupe de fleurs séchées pour 50 cl d'eau bouillante. Laisser infuser 10 min. Ajouter à l'eau du bain de siège.\n" +
                        "En cas de persistance des symptômes, consulter un médecin.\n",
                " Précautions d'emploi :\n"+
                        "Le lamier blanc ne présenterait à ce jour aucune toxicité ni aucun effet secondaire, aux doses recommandées.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Laurier Commun",
                "lauriercommun",
                "Nom latin:  Laurus nobilis.\n",
                "Famille: Lauracées.\n",
                "Type:Feuille.",
                "Propriétés :\n"+
                        "Les grandes propriétés du laurier sont antirhumatismales et digestives. Son huile essentielle aide à combattre les bactéries, les virus, les aphtes, les stomatites et la douleur. Son activité anti-inflammatoire a été prouvée par une étude iranienne menée sur des animaux, en 2003 (1).",
                "Parties utilisées: Les feuilles et les baies.\n",
                "Posologie :\n"+
                        "En usage interne\n" +
                        "Contre les troubles digestifs, la transpiration insuffisante\n" +
                        "Infusion : 5 à 10 g de feuilles séchées pour un litre d'eau bouillante. Laisse infuser 10 minutes avant de filtrer. Boire 2 à 3 tasses par jour.\n" +
                        "En usage externe\n" +
                        "Contre les stomatites et les aphtes\n" +
                        "Huile essentielle : diluer à 50% dans une huile végétale. Appliquer 3 ou 4 fois par jour après avoir testé la préparation sur une petite zone pour s'assurer de l'absence de réaction allergique.\n" +
                        "Contre les rhumatismes\n" +
                        "Beurre de laurier : appliquer 2 ou 3 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n" ,
                " Précautions d'emploi :\n"+
                        "L'huile essentielle de laurier peut causer des réactions allergiques en usage externe. Sa consommation par voie orale doit se faire uniquement sur prescription médicale. Les feuilles ne présentent aucun risque connu à ce jour, aux doses recommandées.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées. \n"

        );
        sqLiteHelper.insertData(
                "Laurier Rose",
                "laurierrose",
                "Nom latin: Nerium oleander.\n",
                "Famille: Apocynacées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Le laurier-rose contient un principe actif qui possède les mêmes propriétés que la digitaline. Grâce à son effet tonicardiaque, il ralentit le rythme cardiaque, renforce les contractions du cœur et augmente la tension artérielle. Il exerce également une action diurétique et contribue à améliorer le fonctionnement de l’appareil urinaire. On l’utilise principalement pour traiter les hyposystolies (perte de force des contractions cardiaques), les tachycardies (fréquence cardiaque anormalement faible) et les arythmies (troubles du rythme cardiaque). En usage externe, cette plante est indiquée dans la prise en charge des maladies de la peau accompagnées de démangeaisons (dermatoses prurigineuses), des contusions et des cancers ulcérés.",
                "Parties utilisées:La plante entière.\n",
                "Posologie :\n"+
                        "En usage interne\n" +
                        "Pilules (de 0,02 ou 0,05 g) : dose journalière variable selon les patients. Posologie journalière maximale à ne pas dépasser : 0,20 g.\n" +
                        "En usage externe\n" +
                        "Contre la teigne, la gale, les cancers ulcérés et les contusions. Lotions : Laisser macérer 20 g de feuilles pulvérisées pour 1 litre d’eau.\n" +
                        "Ou Compresses : Faire bouillir 125 g de feuilles pour 1 litre d’eau. Laisser infuser et appliquer directement sur les lésions.\n",
                " Précautions d'emploi :\n"+
                        "Le laurier-rose est une plante très toxique qui contient du poison. Une feuille ingérée juste après avoir été cueillie peut entraîner des troubles sévères et conduire au décès. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées."

        );
        sqLiteHelper.insertData(
                "Lin",
                "lin",
                "Nom latin: Linum usitatissimum.\n",
                "Famille: Linacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "La graine de lin contient surtout une huile grasse poly-insaturée à très haute teneur en acides gras essentiels, qui participe à l’action laxative de la graine. Riche en lignanes (phyto-oestrogènes), la plante intervient dans la régulation hormonale et permet de réduire certains désagréments de la ménopause comme les bouffées de chaleur. Ses mucilages (substance végétale visqueuse composée de sucres) s’utilisent sous forme de farine dans le traitement des inflammations de la peau.",
                "Parties utilisées: Les graines.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les constipations chroniques, troubles fonctionnels du côlon, inflammations des muqueuses gastrique et intestinale \n" +
                        "Macération : 15 à 20 g de graines pour 1 litre d’eau froide. Laisser macérer une nuit, filtrer. Un verre le matin à jeun puis 4 à 5 verres dans la journée, en dehors des repas. \n" +
                        "Contre les troubles liés à la ménopause (toujours après avis d’un médecin phytothérapeute) \n" +
                        "Graines entières : bien mâcher (en salivant) 2 à 4 cuillères à café (selon son poids) avant d’avaler. Une fois par jour. \n" +
                        "En usage externe\n" +
                        "Contre les inflammations articulaires, dermatoses, prurits, contusions \n" +
                        "Cataplasme : Verser lentement de l’eau (la moins calcaire possible) sur de la farine de lin jusqu’à obtenir une pâte onctueuse. Faire réchauffer à feu doux et étaler tiède sur une gaze en 1 cm d’épaisseur. Appliquer 1 à 3 fois par jour. \n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "Cette plante ne doit pas être prise sans avis médical dans l’indication \"troubles de la ménopause\". Elle est proscrite en cas d’antécédent de cancer du sein. Il faut aussi faire attention aux farines périmées. Enfin, le lin ne doit pas être utilisé en cas d’occlusion intestinale. Ne l’administrez jamais chez l’enfant de moins de 6 ans sans avis médical.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées. \n"

        );
        sqLiteHelper.insertData(
                "Livèche",
                "liveche",
                "Nom latin: Ligusticum levisticum ou Levisticum officinale.\n",
                "Famille: Ombellifère.\n",
                "Type:Feuille.",
                "Propriétés :\n"+
                        "La livèche est indiquée en cas de rhumatisme comme la crise de goutte. Grâce à son effet diurétique, la livèche permet de soigner les infections urinaires comme les cystites, les néphrites et elle lutte également contre les insuffisances urinaires. Les troubles digestifs comme les ballonnements peuvent aussi être soignés par la plante." ,
                "Parties utilisées: Graines, racines et parfois les feuilles.\n",
                "Posologie : Faire infuser une cuillère à café de graine dans une tasse d’eau bouillante. Boire 2 à 3 tasses par jour.\n" ,
                " Précautions d'emploi :\n"+
                        "Cette plante est déconseillé en cas de maladie rénale, d'un oedème ou de maladies cardio-vasculaire, aux femmes enceintes et aux enfants.\n" +
                        "- Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées. Demander conseil à son médecin.\n"

        );
        sqLiteHelper.insertData(
                "Lotier Corniculé",
                "loitiercornicule",
                "Nom latin: Lotus corniculatus .\n",
                "Famille: Fabacées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "Le lotier corniculé contient des nitrilosides et des flavonoïdes, des molécules qui ont des propriétés sédatives et agissent sur les nerfs. Cette plante est surtout utilisée dans la prise en charge des troubles du sommeil (insomnies), de l’anxiété, du stress et des états dépressifs légers. Elle est aussi employée pour traiter les tachycardies.",
                "Parties utilisées: La tige et les fleurs.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les troubles du sommeil, l’anxiété, le stress et la dépression légère . Infusion : Faire bouillir une cuillère à café de plante séchée pour 1 tasse d’eau.\n" +
                        "Contre les insomnies , boire 2 tasses par jour, une vers 18h et la deuxième avant de se coucher.\n" +
                        "Contre l’anxiété, le stress et la dépression légère , boire 3 tasses par jour (au lever, le midi et au coucher).\n" +
                        "Ou Teinture : 70 gouttes par jour (insomnies) ou 90 gouttes par jour (anxiété, stress, dépression).\n" +
                        "Contre les insomnies , introduire 20 gouttes vers 18h dans un demi-verre d’eau, puis 50 gouttes avant de se coucher.\n" +
                        "Contre l’anxiété, le stress et la dépression légère , prendre 20 gouttes le matin, 20 gouttes le midi et 50 gouttes au coucher. N.B. : En cas de réveil nocturne, boire un demi-verre d’eau avec 20 gouttes.\n" +
                        "Ou Gélules : 2 gélules par jour en cas d’insomnies (vers 18h et au coucher), 3 gélules par jour en cas d’anxiété, de stress ou de dépression (matin, midi et soir).\n" +
                        "Contre les douleurs associées aux fibromyalgies. Infusion : Mélanger 50 g de lotier (fleurs), d’escholtzia (feuilles et tiges), d’aspérule odorante (feuilles), d’aubépine (fleurs et feuilles) et de mélilot (fleurs). Faire bouillir 1 cuillère à soupe du mélange pour 1 tasse d’eau. Laisser infuser pendant 10 minutes. Boire 2 ou 3 tasses par jour jusqu’à ce que les douleurs disparaissent.\n",
                " Précautions d'emploi :\n"+
                        "Le lotier corniculé est déconseillé pendant la grossesse, l’allaitement et chez les jeunes enfants. La dose maximale est de 3 tasses par jour et la durée du traitement ne doit pas excéder 3 semaines par mois. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées."

        );
        sqLiteHelper.insertData(
                "Luzerne-Alfalfa",
                "luzerne",
                "Nom latin: Medicago sativa.\n",
                "Famille: Fabacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Fortifiante et riche en vitamine C, la luzerne est une excellente alliée pour lutter contre la fatigue. Des études menées sur des animaux ont par ailleurs démontré que la farine extraite de ses graines abaisserait le taux de cholestérol et de triglycérides (1). Elle favorise aussi la lactation et la régularité des règles. On l'utilise notamment contre la maigreur chez l'enfant et le nervosisme. En usage externe, elle entre dans la composition de cosmétiques pour lutter contre le vieillissement cutané.",
                "Parties utilisées: L'herbe.\n",
                "Posologie :\n"+
                        "En usage interne\n" +
                        "Contre la fatigue, l'épuisement, le nervosisme et la maigreur chez l'enfant.\n" +
                        "Teinture-mère : 50 gouttes dans un verre d'eau, à boire le matin et à midi.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "La luzerne ne doit pas être utilisée en cas de lupus érythémateux. Demandez conseil à votre médecin avant toute prise et ne dépassez pas les doses prescrites.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Mais",
                "mais",
                "Nom latin: Zea Mays .\n",
                "Famille: Poacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n"+
                        "Diurétiques, les stigmates (extrémités des épis) de maïs sont essentiellement prescrits pour soigner les maladies urinaires, telles que la cystite, l'inflammation des voies urinaires, les oedèmes rénaux ou encore la lithiase rénale. Ils peuvent également être recommandés en cas de crise de goutte. Présentant des propriétés anti-inflammatoires, l'insaponifiable de maïs obtenu à part du grain se révèle efficace pour traiter les gingivopathies (lésions inflammatoires de la gencive). La cosmétologie retient le maïs pour ses vertus adoucissantes, revitalisantes, hydratantes et antirides.",
                "Parties utilisées: Les stigmates, le grain et le germe.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "En cas de cystite, d'inflammation des voies urinaires, d'oedèmes rénaux et de lithiase rénale\n" +
                        "4 à 6 g de stigmates séchés par jour.\n" +
                        "Infusion : 1 cuillère à café de stigmates pour 1 tasse d'eau. Porter rapidement à ébullition et laisser infuser 5 min.\n" +
                        "Ou\n" +
                        "Gélules dosées à 150 mg d'extrait sec : 2 à 4 par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n"+
                        "Le maïs ne présente aucune toxicité connue à ce jour.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Marcisse",
                "marcisse",
                "Nom latin: Narcissus pseudo-narcissus.\n",
                "Famille: Narcissées.\n",
                "Type:Fleur.",
                "Propriétés :\n"
                        +"Les fleurs du narcisse des prés contiennent des molécules qui exercent une action antispasmodique (elles préviennent les contractions musculaires involontaires) et antidiarrhéique. Cette plante est utilisée dans la prise en charge des convulsions, des troubles nerveux, des diarrhées chroniques, de la coqueluche, de l’asthme et des toux convulsives. Grâce à son effet émétique, elle est parfois employée pour induire des vomissements.",
                "Parties utilisées:Les fleurs.\n",
                "Posologie : \n" +
                        "En usage interne\n" +
                        "Infusion : Faire bouillir 1 cuillère à café de fleurs pour 1 tasse d’eau. Laisser infuser 10 minutes. Prendre 1 cuillère à soupe à différents moments de la journée.\n" +
                        "Ou Poudre de fleurs : Verser entre 1 et 2 g dans un liquide.\n",
                " Précautions d'emploi :\n"+
                        "Le narcisse des prés contient des substances toxiques telles que la galanthamine qui peuvent entraîner des troubles digestifs (nausées, vomissements, douleurs abdominales) et nerveux, ainsi que des maux de tête, des frissons et des allergies. L’ingestion du bulbe, la partie la plus toxique de la plante, est susceptible de conduire au décès dans les cas les plus graves. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées."
        );
        sqLiteHelper.insertData(
                "Marrube",
                "marrube",
                "Nom latin:  Marrubium vulgare.\n",
                "Famille: Lamiacées.\n",
                "Type:Feuille.",
                "Propriétés :\n" +
                        "Le marrube contient des substances eupeptiques qui soulagent les troubles digestifs légers. Il est également utilisé pour apaiser l’inflammation des voies respiratoires. Son efficacité est due à ses propriétés analgésiques (1), anti-inflammatoires (2) et antimicrobiennes (3). Enfin, des recherches publiées en 2006 ont démontré que l’action antioxydante du marrube pouvait protéger du «mauvais» cholestérol (LDL) et accentuer le «bon» (HDL) (4).",
                "Parties utilisées: Les sommités fleuries.\n",
                "Posologie :\n"+
                        "En usage interne\n" +
                        "Contre les troubles digestifs légers, la toux rebelle, l'inflammation des voies respiratoires\n" +
                        "Teinture : 10 à 20 gouttes dans un verre d'eau, 2 ou 3 fois par jour, avant les repas.\n" +
                        "Ou\n" +
                        "Sirop : 3 g d'extrait hydroalcoolique à mélanger dans 200g de sirop simple. Prendre 2 à 3 cuillères à soupe par jour entre les repas.\n" +
                        "Contre les troubles de la sécrétion biliaire.\n" +
                        "Infusion : 1 cuillère à soupe de plante séchée pour une tasse d'eau bouillante. Laisser infuser 10 minutes. Boire 4 à 5 tasses par jour.\n" +
                        "En usage externe\n" +
                        "Contre les ulcérations et les plaies suppurantes\n" +
                        "Compresses : 30 à 60g de plante séchée pour 1 litre d'eau bouillante. Faire bouillir 3 minutes puis laisser infuser 10 minutes. Imbiber un linge de cette décoction et appliquer 1 ou 2 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "Le marrube est contre-indiqué aux femmes enceintes. A forte dose, la marrubiine, une substance active dans le marrube, perturbe le rythme cardiaque. Respectez la posologie et demandez conseil à un médecin ou à un pharmacien.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Mauve",
                "mauve",
                "Nom latin: Malva sylvestris.\n",
                "Famille: Malvacées.\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "La mauve est utilisée dans le traitement de la constipation et des colites spasmodiques. Elle calme les affections bronchiques, les maux de gorge et la toux. En dermatologie, la mauve est reconnue pour ses vertus adoucissantes et anti-démangeaisons. Elle peut aussi être conseillée comme antalgique dans les affections de la cavité buccale. Selon des travaux récents, ses polysaccharides (sucres) lui confèrent une action immuno-stimulante.",
                "Parties utilisées: Les fleurs et les feuilles.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre la constipation, les colites spasmodiques \n" +
                        "Infusion : 10 à 15 g de fleurs séchées pour 1 litre d’eau bouillante. Laisser infuser 10 min. Filtrer. 3 à 4 tasses par jour.\n" +
                        "Contre les affections bronchiques, la toux \n" +
                        "Infusion : 5 g de plante sèche pour 1 litre d’eau. Laisser bouillir 5 min. Filtrer. 1 à 3 tasses par jour. \n" +
                        "ou \n" +
                        "Gélules dosées à 250 mg de poudre : 3 à 5 par jour dans un grand verre d’eau.\n" +
                        "En usage externe\n" +
                        "Contre les affections cutanées, de la cavité buccale\n" +
                        "Décoction (concentrée) : 30 g de fleurs et/ou de feuilles séchées pour 1 litre d’eau bouillante. Laisser infuser 10 min. A utiliser en application locale (prurit, peau sèche), en gargarismes ou en bains de bouche (inflammations buccales, enrouement) plusieurs fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "La plante n’a jamais présenté à ce jour de toxicité, même en utilisation prolongée. Elle reste cependant contre-indiquée chez l’enfant de moins de 6 ans et la femme enceinte ou allaitante.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Menthe Poivrée",
                "menthepoivree",
                "Nom latin: Mentha x piperita.\n",
                "Famille: Lamiacées.\n",
                "Type:Feuille.",
                "Propriétés:\n"+
                        "Grâce à l’huile essentielle et aux flavonoïdes qu’elle contient, la menthe poivrée (variété la plus utilisée) possède de puissants effets antispasmodiques digestifs. Elle lutte efficacement contre les ballonnements, les éructations, les flatulences... En dermatologie, la plante est recommandée pour ses bienfaits adoucissants et antidémangeaisons. La menthe poivrée est également un bon décongestionnant nasal et s’avère efficace en cas de rhumes. Enfin, elle a des vertus antiseptiques.",
                "Parties utilisées: Les feuilles (fraîches ou séchées).\n",
                "Posologie :\n"+
                        "En usage interne:\n" +
                        "Contre la digestion lente (ballonnements, gaz, éructations…)\n" +
                        "Infusion : 1 cuillère à soupe de feuilles séchées pour 15 cl d’eau bouillante. Laisser infuser 10 à 15 min. 1 tasse après chaque repas. (Pour un effet tonifiant : 2 tasses. Pour un effet sédatif : 1 tasse le soir).\n" +
                        "Contre les infections hivernales\n" +
                        "Infusion : faire infuser 4 à 5 g de fleurs fraîches ou sèches dans une tasse d’eau bouillante, 10 min. Filtrer. 2 tasses par jour au moment des repas.7 jours en curatif\n" +
                        "En cure détox\n" +
                        "Drainage spécial agapes : en curatif, 2 gouttes d’huiles essentielles diluées dans une cuillerée à café d’huile d’olive, pendant 2 jours.\n" +
                        "En usage externe:\n" +
                        "Contre les rhumes et les affections buccales\n" +
                        "Inhalation ou bains de bouche : 1 poignée de feuilles dans un bol d’eau bouillante. 2 à 3 fois par jour.\n"+
                        "Contre les affections dermatologiques\n" +
                        "Huile essentielle diluée à 5 % dans une huile de noyau d’abricot : en application locale matin et soir.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n"+
                        "L’utilisation de la feuille de menthe fraîche ou séchée ne présenterait pas de risques. En revanche, il ne faut jamais ingérer la menthe sous forme d’huile essentielle (HE) pure sans prescription médicale (risque toxique). La plante est contre-indiquée chez l’enfant de moins de 6 ans, en raison du risque de spasme laryngé (contraction du larynx), et chez la femme enceinte ou allaitante."
        );
        sqLiteHelper.insertData(
                "Ményanthe",
                "menyanthe",
                "Nom latin: Menyanthes trifoliata.\n",
                "Famille: Ményanthacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Anti-inflammatoire, le ményanthe favorise les sécrétions gastriques et salivaires. Réputé pour ouvrir l'appétit, il est essentiellement conseillé en cas d'inappétence, de constipation et de digestion lente. Grâce à ses propriétés digestives, le ményanthe se révèle efficace contre les migraines dont souffrent les personnes nerveuses et dyspeptiques, après les repas. Il est également utilisé pour favoriser la prise de poids.",
                "Parties utilisées: Les feuilles.\n",
                "Posologie: \n"+
                        "En usage interne\n" +
                        "En cas d'inappétence, de constipation et de digestion lente\n" +
                        "Infusion : 2,5 g de feuilles et sommités fleuries pour 50 cl d'eau bouillante. Laisser infuser 15 min. 3 tasses par jour.\n" +
                        "Décoction : 1 à 2 cuillères à café de rhizome rapé pour 25 cl d'eau froide. Faire bouillir 5 min. Laisser reposer 5 à 15 min, filtrer. 1 tasse non sucrée 15 à 30 min avant les repas.\n" +
                        "Macération à froid : même quantité que pour la décoction, laisser reposer 5 à 6 h. 1 tasse non-sucrée 15 à 30 min avant les repas.\n" +
                        "Gélules de poudre dosées à 350-400 mg : 3 à 6 à répartir dans la journée.\n" +
                        "En cas de persistances des symptômes, consultez un médecin.\n",
                "Précautions d'emploi :\n"+
                        "Le ményanthe ne présente aucune toxicité connue à ce jour aux doses indiquées. Son amertume peut réduire les risques d'excès à l'origine de vomissements.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"
        );
        sqLiteHelper.insertData(
                "Millepertuis",
                "millepertuis",
                "Nom latin: Hypericum perforatum.\n",
                "Famille: Hypericacées.",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Grâce à l’un de ses composants, l’hyperricine et à ses dérivés, le millepertuis a une action antiseptique et antivirale. Mais il est surtout connu pour ses effets antidépresseurs. Aussi, est-il conseillé dans le traitement des manifestations dépressives légères telles que la lassitude nerveuse ou des troubles du sommeil.",
                "Parties utilisées: Les sommités fleuries.\n",
                "Posologie:\n"+
                        "EN USAGE INTERNE\n" +
                        "Contre la lassitude nerveuse et les troubles du sommeil\n" +
                        "Infusion : 1 cuillère à café de plante séchée pour une tasse d’eau bouillante. Laisser infuser 5 min. Filtrer. 2 tasses par jour au moment des repas. \n" +
                        "ou \n" +
                        "Vin :Laisser macérer 50 g de fleurs dans un litre de vin rouge, 2 à 3 semaines. Passer, exprimer, puis filtrer.\n" +
                        "Contre les troubles digestifs\n" +
                        "1 verre à madère le soir, une heure avant de se coucher ou juste après le dîner.\n" +
                        "Contre la baisse de libido\n" +
                        "1 verre à madère de vin matin et soir.\n" +
                        "En cas de persistance des symptômes consultez rapidement un médecin.\n",
                " Précautions d'emploi :\n"+
                        "Des précautions sont nécessaires en raison de la présence d’hypericine et de ses propriétés photosensibilisantes. Par voie orale, il faut se méfier des interactions médicamenteuses : la prise de spécialités pharmaceutiques à base de millepertuis est déconseillée en cas de traitement contenant de la digoxine, de la théophylline, ou de prise d’un contraceptif oral, d’un antidépresseur ou d’un antimigraineux de la famille des triptans. Ne pas donner en dessous de 6 ans sans avis médical."

        );
        sqLiteHelper.insertData(
                "Monarde",
                "monarde",
                "Nom latin:  Monarda didyma.\n",
                "Famille: Lamiacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "La monarde est convoitée en phytothérapie pour ses fleurs, ses feuilles et l’huile essentielle extraite des feuilles. Ces parties de la plante ont une propriété apéritive (elles ouvrent l’appétit), tonique (elles facilitent la digestion), fébrifuge (elles font baisser la fièvre), expectorante (elles dégagent les voies respiratoires), antivirale, antibactérienne et antifongique (elles soignent les infections causées par des champignons). Cette plante est indiquée dans le traitement de la fièvre, des rhumes, des bronchites chroniques (inhalation), de la grippe, des infections et des troubles digestifs (ballonnements, douleurs abdominales). En usage externe, elle est administrée sous forme de bain de bouche pour traiter les gingivites (inflammations des gencives) et infections buccales. L’huile essentielle est parfois employée pour combattre l’anxiété.",
                "Parties utilisées: Les fleurs et les feuilles.\n",
                "Posologie :\n" +
                        "Zn usage interne:\n" +
                        "La monarde présente des propriétés digestives et stimulantes de l'appétit. Elle est aussi utilisée comme fébrifuge. Enfin, on la recommande pour soigner les bronchites chroniques. L'huile essentielle est, quant à elle, antibactérienne, antifongique et antivirale.\n" +
                        "En usage externe:\n" +
                        "Action antibactérienne.\n" +
                        "Indications thérapeutiques usuelles:\n" +
                        "La monarde peut être conseillée pour atténuer les infections des voies respiratoires et les troubles du système digestif. Elle traite les ballonnements, les flatulences et les crampes intestinales. On l'utilise traditionnellement en gargarismes, pour les infections de la bouche ou pour soigner les gingivites.\n" +
                        "Autres Indications thérapeutiques Démontrées:\n" +
                        "En usage externe, la monarde participe à la guérison des petites blessures. L'huile essentielle permet de lutter contre l'anxiété.",
                " Précautions d'emploi :\n"+
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées."

        );
        sqLiteHelper.insertData(
                "Moutarde",
                "moutarde",
                "Nom latin: Sinapis nigra (moutarde noire) – Sinapis Alba (moutarde blanche) – Sinapis arvensis (moutarde sauvage) .\n",
                "Famille: Crucifère.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "On accorde à la moutarde beaucoup de propriétés. Elle soigne les pathologies respiratoires comme la congestion pulmonaire et les bronchites. Les douleurs liées aux rhumatismes sont aussi traitées par la moutarde. La moutarde agit sur les congestions cérébrales.",
                "Parties utilisées: Semence (graine) qui produit de la farine de moutarde.\n",
                "Posologie :\n" +
                        "Utilisation externe contre la congestion céphalique\n" +
                        "Faire un bain de pied avec 20 à 30 grammes de farine de moutarde par litre d’eau tiède.\n" +
                        "Utilisation externe contre la paralysie\n" +
                        "Prendre un bain avec 150 grammes de farine de moutarde.\n",
                " Précautions d'emploi :\n"+
                        "En usage externe la moutarde est déconseillée en cas de troubles de la circulation.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées. Demander conseil à votre médecin.\n"

        );
        sqLiteHelper.insertData(
                "Moutarde Noire",
                "moutardenoir",
                "Nom latin: Brassica negra.\n",
                "Famille:  Brassicacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "La moutarde noire est appréciée pour ses graines et ses fleurs, qui possèdent des propriétés différentes. Les graines contiennent du sinigroside, une molécule que l’on trouve également dans les brocolis et les choux de Bruxelles. Grâce à son action révulsive, cette molécule augmente le calibre des vaisseaux sanguins de la zone avec laquelle elle est en contact. Elle permet ainsi d’améliorer la circulation sanguine et d’apaiser les douleurs en cas d’inflammation. Les graines sont indiquées dans la prise en charge des bronchites, de la toux, de la grippe, des rhumatismes, des névrites et des infections urinaires. Les fleurs sont utilisées en usage interne pour traiter les problèmes de digestion et stimuler l’appétit.\n",
                "Parties utilisées: Les fleurs et les graines.\n",
                "Posologie :\n" +
                        "En usage interne\n" +
                        "Contre les problèmes de digestion et pour stimuler l’appétit . Infusion : Faire bouillir 1,5 g de fleurs (1 cuillère à café) pour 1 tasse d’eau. Laisser infuser pendant 5 minutes avant de filtrer. Boire 3 tasses par jour.\n" +
                        "En usage externe\n" +
                        "Contre les bronchites, la toux, la grippe et les rhumatismes . Cataplasmes : Mélanger 50 g de farine de moutarde noire, 200 g de farine de lin et de l’eau tiède. Verser l’eau progressivement jusqu’à ce que le mélange devienne une pâte épaisse, puis l’enfermer dans une toile ou entre 2 linges. Appliquer sur les zones douloureuses (dos, poitrine…) pendant 10 minutes (entre 3 et 5 minutes chez les enfants).\n",
                " Précautions d'emploi :\n"+
                        "L’application de cataplasmes ne doit pas dépasser 10 minutes afin d’éviter des effets indésirables. Un contact prolongé peut entraîner des douleurs sévères et des lésions cutanées, voire une nécrose chez certaines personnes. La moutarde noire est contre-indiquée en cas de varices ou d’autres troubles veineux."+
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées."

        );
        sqLiteHelper.insertData(
                "Muscadier",
                "muscadier",
                "Nom latin: myristica fragrans.\n",
                "Famille: myristicacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n"+
                        "La noix du muscadier (qui se trouve dans le fruit) est réputée pour faciliter la digestion. Selon une étude menée au Nigeria, elle pourrait aussi prévenir les thromboses (formation d’un caillot de sang). L’huile essentielle de la plante est, elle, reconnue pour ses vertus stimulantes, voire aphrodisiaques… Elle peut enfin être utilisée en cas de douleurs articulaires, de tendinites et de rhumatismes.\n",
                "Parties utilisées: La noix.\n",
                "Posologie :\n"+
                        "En usage externe\n" +
                        "Contre les douleurs articulaires, les rhumatismes, les tendinites\n" +
                        "Huile essentielle : diluée à 1% dans de l’huile végétale ou une crème. Appliquer 1 à 3 fois par jour. \n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "L’huile essentielle de noix de muscade ne doit jamais être utilisée en usage interne ! Elle peut irriter le tube digestif, entraîner des vertiges, des maux de tête et des hallucinations. En usage externe, évitez les applications à long terme et à fortes doses (risque sinon d’irritations cutanées).\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Myrte",
                "myrte",
                "Nom latin: Myrtus communis.\n",
                "Famille: Myrtacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n"+
                        "Le myrte est apprécié pour ses nombreuses vertus thérapeutiques. Il est utilisé en dermatologie, car il possède des propriétés antiseptiques (désinfectantes), astringentes (il assèche les tissus et favorise la cicatrisation des plaies), hémostatiques (il stoppe les hémorragies) et adoucissantes. On l’emploie en usage externe pour traiter les plaies, les furoncles, les abcès, certaines maladies de la peau et les infections qui entraînent l’apparition de pus. Grâce à son effet décongestionnant, cette plante permet de lutter contre les affections pulmonaires (tuberculose pulmonaire). Elle peut être indiquée dans la prise en charge des otites, des sinusites, des prostatites (inflammation de la prostate), des diarrhées, des hémorroïdes et des leucorrhées (pertes blanches). Elle contient une huile essentielle qui permet de lutter contre les poux. Enfin, le myrte est parfois associé à d’autres plantes pour soigner les gingivites (inflammation des gencives).",
                "Parties utilisées: Les feuilles, les fleurs et les fruits.\n",
                "Posologie :\n"+
                        "En usage interne\n" +
                        "Contre les affections pulmonaires . Infusion : Faire bouillir 10 g de feuilles séchées pour 1 litre d’eau. Laisser infuser pendant 10 minutes et filtrer avant de boire. Prendre 2 tasses par jour. Ou Décoction : Placer 10 g de feuilles séchées dans de l’eau froide. Faire bouillir dans 1 litre d’eau pendant 10 minutes et filtrer avant de boire. Prendre 2 tasses par jour.\n" +
                        "En usage externe\n" +
                        "Contre les abcès, les furoncles et les maladies de la peau . Compresses : Réaliser la décoction indiquée en usage interne. Placer le mélange entre deux linges et appliquer sur les lésions (2 ou 3 applications par jour).\n" +
                        "Contre les gingivites. Mélanger 5 ml d’huile essentielle de myrte, d’arbre à thé, de citron et de laurier noble dans 50 ml d’huile de millepertuis. Laver et désinfecter les gencives avec de l’alcool. Verser quelques gouttes du mélange sur le doigt et masser les gencives. Réaliser 3 massages par jour, après les repas.\n",
                " Précautions d'emploi :\n"+
                        "Les huiles essentielles du myrte doivent être utilisées avec modération en raison des irritations qu’elles peuvent provoquer à fortes doses. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Nénuphar",
                "nenuphar",
                "Nom latin: Nymphaea alba, nuphar luteum.\n",
                "Famille: Nymphéacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Le nénuphar blanc et le nénuphar jaune sont les deux espèces de cette plante aquatique les plus utilisées en phytothérapie. Le nénuphar blanc possède des propriétés sédatives (il « endort » l’organisme) et antispasmodiques (il prévient les contractions musculaires involontaires). Il est indiqué dans la prise en charge des insomnies, de l’anxiété, des diarrhées et de la toux. Il exerce également une action anaphrodisiaque et est employé pour réduire l’excitation sexuelle, notamment en cas de nymphomanie (désir sexuel très important) ou de priapisme (érection de plusieurs heures). Le nénuphar jaune est un antibiotique qui permet de traiter des infections génitales d’origine bactérienne. Grâce à leur effet cicatrisant, les deux plantes agissent efficacement contre les brûlures, les gerçures, les inflammations de la peau, les allergies solaires (érythèmes solaires) et les fissures cutanées (crevasses).\n",
                "Parties utilisées:\n"+
                        "\tNénuphar blanc : les fleurs et le rhizome.\n"+
                        "\tNénuphar jaune : le rhizome.\n",
                "Posologie :\n" +
                        "En usage interne : Nénuphar blanc\n" +
                        "Contre l’excitation sexuelle et les diarrhées. Infusion : Faire bouillir 5 g de fleurs séchées dans 25 cl d’eau. Laisser infuser pendant 20 minutes. Boire entre 2 et 3 tasses par jour.\n" +
                        "Ou Décoction : Placer 5 g de rhizome séché sous de l’eau froide. Faire bouillir dans 20 cl d’eau pendant 15 minutes. Boire entre 2 et 3 tasses par jour. En usage externe : Nénuphars blanc et jaune\n" +
                        "Contre les brûlures, les gerçures, les allergies solaires et les crevasses . Compresses : Réaliser la décoction détaillée en usage interne. Imbiber un linge du mélange et appliquer directement sur les lésions, entre 3 et 6 fois par jour.\n",
                " Précautions d'emploi :\n"+
                        "L’usage prolongé du nénuphar blanc est à éviter car il pourrait entraîner une perte irréversible du désir sexuel. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Nigelle",
                "nigelle",
                "Nom latin: nigella sativa.\n",
                "Famille: Renonculacées.\n",
                "Type:Fleur.",
                "Propriétés: \n"+
                        "La nigelle est une plante dont la graine est réputée contre les troubles digestifs. Elle pourrait apaiser les douleurs d’estomac et les diarrhées. Autres bienfaits de la plante : des effets protecteurs du foie et des reins, des effets antioxydants, des effets anti-inflammatoires, antidouleur ou encore antimicrobiens. Des effets anticancer sont à l’étude .",
                "Parties utilisées: Les graines.\n",
                "Posologie :\n"+
                        "En usage externe\n" +
                        "Contre les problèmes de peau\n" +
                        "On trouve de la nigelle sous forme d’huile, à utiliser pour hydrater la peau et lutter contre l’oxydation des radicaux libres.\n" +
                        "Contre les troubles digestifs\n" +
                        "Consommer quelques graines de nigelle avant ou après les repas. En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "Aux doses recommandées, la nigelle n’a démontré aucune toxicité à ce jour.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Nopal(Figue De Barbarie)",
                "nopal",
                "Nom latin: Opuntia ficus indica.\n",
                "Famille: Cactacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Le nopal est convoité en phytothérapie pour sa propriété anti-inflammatoire, antispasmodique (il prévient les contractions musculaires involontaires), diurétique (il améliore le fonctionnement de l’appareil urinaire), hypoglycémiante (il fait baisser le taux de cholestérol) et anti-oxydante (il ralentit le vieillissement des cellules). Il est utilisé pour lutter contre les troubles digestifs (gastro-entérites, coliques, diarrhées, ulcères de l’estomac), le stress, l’anxiété, la dépression et l’artériosclérose (dégénérescence des artères). Il est parfois recommandé comme complément alimentaire chez les diabétiques ou en cas d’hypercholestérolémie (excès de cholestérol). Il est indiqué en usage externe pour traiter les rides, les vergetures et autres lésions cutanées.\n",
                "Parties utilisées: Les fruits frais et l’huile.\n",
                "Posologie :\n"+
                        "En usage interne \n" +
                        "Contre l’anxiété et la dépression. \n" +
                        "Gélules : Prendre 2 gélules de 300 mg 3 fois par jour (6 gélules au total) pendant les repas.\n",
                " Précautions d'emploi :\n"+
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Noyer",
                "noyer",
                "Nom latin:  juglans regia.\n",
                "Famille: Juglandacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n"+
                        "Les feuilles du noyer sont réputées pour leurs effets antidiarrhéiques et antifongiques. Le fruit de l’arbre, la noix, est elle reconnue pour améliorer la circulation veineuse et lymphatique parce qu’elle est riche en L-arginine, un acide aminé donnant naissance au monoxyde d’azote, un vasodilatateur. Elle contient aussi des acides gras oméga 3 ce qui lui confère des propriétés préventives des maladies cardio-vasculaires (1). Enfin, la plante peut être utilisée pour soigner un eczéma, de l’acné ou des ulcères cutanés.",
                "\nParties utilisées: Les feuilles.\n",
                "Posologie :\n"+
                        "En usage interne\n" +
                        "Contre les diarrhées, les déséquilibres de la flore intestinale, les troubles de la circulation veineuse ou lymphatique\n" +
                        "Infusion: 2 cuillères à soupe rase de feuilles séchées pour 1 litre d’eau bouillante. Infuser pendant 5 minutes puis filtrer. Boire 1 à 2 tasses par jour jusqu’à amélioration des symptômes.\n" +
                        "En usage externe\n" +
                        "Contre les problèmes de peau (acné, eczéma, ulcères cutanés)\n" +
                        "Utiliser de la crème, du gel ou du savon contenant 1 à 3% de teinture ou d’extrait fluide de noyer.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "Le noyer ne doit pas être utilisé en cas d’aphtes, d’herpès, de syndrome du côlon irritable et d’allergie aux noix.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Oignon",
                "oignon",
                "Nom latin: Allium cepa.\n",
                "Famille: Liliacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n"+
                        "Souvent réservé à l’usage culinaire, l’oignon est également une excellente plante médicinale aux nombreuses vertus. Son bulbe a une propriété expectorante (il dégage les voies respiratoires), diurétique (il améliore le fonctionnement de l’appareil urinaire), hypoglycémiante (il fait baisser le taux de cholestérol) et anti-infectieuse. Il est utilisé pour traiter et prévenir les affections respiratoires (toux, asthme, bronchite), les maladies cardio-vasculaires (hypertension artérielle), l’hyperthyroïdie, l’ostéoporose et les effets indésirables associés au diabète. L’oignon est aussi un bon antiagrégant plaquettaire qui permet de lutter contre les phlébites (thromboses veineuses profondes). En usage externe, il soulage les migraines, les douleurs nerveuses (névralgies) et soigne certaines affections cutanées (abcès, furoncles, panaris, piqûres d’insectes).\n",
                "Parties utilisées: Le bulbe frais ou cuit.\n",
                "Posologie :\n"+
                        "En usage interne \n" +
                        "Contre l’hypertension. \n" +
                        "Alimentation : Introduire deux oignons frais ou cuits par jour dans l’alimentation. \n" +
                        "Contre l’hyperthyroïdie. \n" +
                        "Alimentation : Manger 1 bulbe frais par jour. \n" +
                        "Ou \n" +
                        "Teinture : 30 gouttes à diluer dans un verre d’eau, 3 fois par jour. \n" +
                        "Ou \n" +
                        "Gélules (280 mg) : 2 gélules par jour. \n" +
                        "En usage externe \n" +
                        "Contre les infections cutanées. \n" +
                        "Cataplasme : Faire bouillir 1 bulbe d’oignon, 1 bulbe de lis blanc, des racines de sceau-de-Salomon et des feuilles de bouillon-blanc. Filtrer et mélanger avec de l’argile verte. Placer entre deux linges et appliquer directement sur les lésions pendant 30 minutes. \n" +
                        "Pour soulager les piqûres d’insectes. \n" +
                        "Application locale : Déposer des lamelles fraîches sur la zone atteinte.\n",
                " Précautions d'emploi :\n"+
                        "L’oignon est déconseillé en cas de flatulences ou de brûlures d’estomac (pyrosis).\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Oillet D'Inde",
                "oilletdinde",
                "Nom latin: Tagetes erecta , Tagetes patula.",
                "Famille: astéracées ( Asteraceae ).\n",
                "Type:Fleur.",
                "Propriétés :\n" +
                        "L'oeillet d'Inde est une plante herbacée dont les fleurs sont comestibles. Les civilisations précolombiennes utilisaient déjà cette plante pour soigner, entre autres, la diarrhée, les parasites et les troubles digestifs.\n",
                "Parties utilisées: les fleurs\n",
                "Posologie :\n"+
                        "\tDosage:\n" +
                        "En gélules, prendre 6 mg de lutéine par jour, pour retarder le vieillissement oculaire et garder l'oeil en bonne santé. En tisanes, l'oeillet d'Inde peut être consommé en cures de trois semaines.\n",
                " Précautions d'emploi :\n"+
                        "Comme toutes les plantes, l'oeillet d'Inde peut provoquer des allergies chez les personnes sensibles.\n" +
                        "Certains cas d'irritations de la peau au contact de la plante ont été signalés.\n" +
                        "CONTRE-INDICATIONS\n" +
                        "Pas de contre-indication connue.\n" +
                        "INTERACTIONS AVEC DES PLANTES MÉDICINALES OU DES COMPLÉMENTS\n" +
                        "L'oeillet d'Inde est souvent utilisé avec le goji et les baies de myrtille , pour diminuer la fatigue oculaire."

        );
        sqLiteHelper.insertData(
                "Olivier",
                "olivier",
                "Nom latin: Olea Europaea.\n",
                "Famille: Oléacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n" +
                        "Selon une étude germano-suisse menée sur 40 personnes, les feuilles d’olivier pourraient diminuer l’hypertension artérielle (surtout quand elle est modérée) et le taux de cholestérol (1). Elles auraient également une action contre le diabète léger (par exemple en cas de grossesse). L’huile de l’arbre pourrait aussi agir comme laxatif dans le traitement des calculs biliaires et contre les coups de soleil et les brûlures superficielles.\n",
                "Parties utilisées: Les feuilles et les fruits.\n",
                "Posologie :\n"+
                        "En usage interne\n" +
                        "Contre l’hypertension artérielle modérée et les formes légères de diabète.\n" +
                        "Infusion: 3 cuillères à soupe rase de feuilles séchées pour 1 litre d’eau bouillante. Infuser pendant 10 minutes puis filtrer. Boire 4 tasses par jour et surveiller la tension\n" +
                        "Attention : ce remède ne peut en aucun cas remplacer un traitement médical classique.\n" +
                        "Contre les calculs biliaires\n" +
                        "Huile d’olive : en prévention, prendre 5cl en plusieurs fois, loin des repas. Pendant la crise, prendre 5 à 15cl en une fois.\n" +
                        "En usage externe\n" +
                        "Contre les coups de soleil et les brûlures\n" +
                        "Utiliser de la crème à base d’huile d’olive plusieurs fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "L’olivier ne présente aucune toxicité à ce jour aux doses recommandées.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Onagre",
                "onagre",
                "Nom latin: Oenothera biennis.\n",
                "Famille: Onagracées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Riche en acides gras, l’onagre participe à la fabrication des prostaglandines (substances qui régulent certaines fonctions hormonales et protègent la membrane cellulaire). Ces dernières sont reconnues pour maintenir la souplesse et l’élasticité de la peau. Elles ont aussi une action antiinflammatoire. L’huile d’onagre est utilisée dans le traitement du syndrome prémenstruel (douleurs mammaires), de l’eczéma et pour soulager l’arthrite rhumatoïde.\n",
                "Parties utilisées: Les graines.\n",
                "Posologie :\n"+
                        "En usage interne :\n" +
                        "Contre le vieillissement de la peau\n" +
                        "Capsules molles de 500 mg : 1 ou 2 capsules par jour au cours du repas par jour, avec un verre d’eau.\n" +
                        "\n" +
                        "Contre l’eczéma, l’arthrite rhumatoïde\n" +
                        "Capsules molles de 500 mg : 2 capsules, 3 fois par jour au cours des repas avec un verre d’eau.\n" +
                        "Contre le syndrome prémenstruel\n" +
                        "Capsules molles de 500 mg : 2 capsules 3 fois par jour, les 10 derniers jours du cycle.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "La plante peut entraîner une prise de poids. Elle est contre-indiquée chez l’enfant de moins de 6 ans et la femme enceinte ou allaitante. L’huile d’onagre est déconseillée en cas d’épilepsie.\n"

        );
        sqLiteHelper.insertData(
                "Oranger Amer",
                "orangeramer",
                "Nom latin: citrus aurantium.\n",
                "Famille: Rutacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n"+
                        "Les principales indications de l’oranger (surtout de ses fleurs) sont la nervosité et les troubles du sommeil passagers. Ses feuilles sont également utilisées pour leurs bienfaits sédatifs (légers) et pour stimuler une digestion lente. Selon des essais menés sur des rats, l’huile essentielle contenue dans les fleurs d'oranger augmenteraient la production de mucus par la muqueuse gastrique, ce qui leur confèrerait un effet protecteur (1).\n",
                "Parties utilisées: Les feuilles, la fleur, le zeste.\n",
                "Posologie :\n"+
                        "En usage interne :\n" +
                        "Contre la nervosité, les troubles du sommeil\n" +
                        "Eau de fleur d’oranger : 20g de fleurs séchées pour 15cl d’eau bouillante ou d’infusion sucrée, le soir, au coucher.\n" +
                        "Contre la digestion lente\n" +
                        "Infusion: 5g de feuilles séchées pour 1 litre d’eau bouillante. Infuser 5 min. Boire 3 tasses par jour, après les repas, jusqu’à amélioration des symptômes.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "L’extrait d’orange amère est contre-indiqué en cas de troubles cardiovasculaires, de troubles de la circulation cérébrale, de diabète, d’hypertension artérielle, de dépression et d’anxiété, de grossesse, d’allaitement. Les feuilles et les fleurs ne présentent pas de contre-indication connue à ce jour. En cas de prise de médicaments, demandez conseil à un médecin car l’orange amère agit sur la métabolisation des médicaments.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Paquerette",
                "paquerette",
                "Nom latin: Bellis perennis.\n",
                "Famille: Astéracées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Souvent ignorée, parfois méprisée, la pâquerette est une de ces plantes qui abondent dans nos prairies, et dont les propriétés sont peu connues. Ses feuilles et ses fleurs ont pourtant de nombreux bienfaits. Elles dégagent les voies respiratoires (effet expectorant), améliorent le fonctionnement de l’appareil urinaire (effet diurétique), nettoient l’organisme en facilitant l’élimination des déchets (effet purgatif), font transpirer (effet sudorifique) et baisser la fièvre (effet fébrifuge). Cette plante est indiquée dans la prise en charge de l’insuffisance rénale et hépatique, des affections urinaires (goutte), des maladies respiratoires (bronchites, laryngites, pleurites, asthme) et des troubles du sommeil (insomnies). Elle atténue les hématomes, réduit les inflammations, soulage les douleurs articulaires causées par les rhumatismes et désinfecte les plaies. La pâquerette est aussi employée en cancérologie pour prendre en charge les mastites (inflammations de la mamelle) et cancers du sein, ainsi qu’en dermatologie pour traiter les furoncles, les ulcères et les maladies de la peau.\n",
                "Parties utilisées: Les feuilles et les fleurs.\n",
                "Posologie :\n"+
                        "En usage interne :\n" +
                        "Infusion : Faire bouillir une cuillère à café de feuilles et de fleurs pour 1 tasse d’eau. Laisser infuser 10 minutes. \n" +
                        "Boire 3 tasses par jour, en dehors des repas. \n" +
                        "Ou \n" +
                        "Teinture : 20 gouttes à diluer dans un verre d’eau (2 ou 3 prises par jour selon la gravité des symptômes). \n" +
                        "En usage externe \n" +
                        "Décoction : Placer les feuilles et les fleurs dans de l’eau froide. Faire bouillir, laisser refroidir un peu et appliquer sur les lésions ou les zones endolories (compresses). \n" +
                        "Ou \n" +
                        "Teinture : 60 gouttes à diluer dans un verre d’eau. Appliquer sur les lésions ou les zones endolories (compresses). \n" +
                        "Contre l’eczéma, le vitiligo et autres affections de la peau. \n" +
                        "Massage : Appliquer de l’huile de pâquerette sur les lésions et masser doucement.\n" +
                        "En cas de doute pour la posologie, demander conseil à un médecin ou pharmacien spécialisé en phytothérapie.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Pariétaire",
                "parietaire",
                "Nom latin: Parietaria officinalis.\n",
                "Famille: Urticacées.\n",
                "Type:Feuille.",
                "Propriétés :\n"+
                        "La pariétaire est utilisée en phytothérapie pour ses propriétés diurétiques (elle améliore le fonctionnement de l’appareil urinaire) et dépuratives (elle facilite l’évacuation des toxines et des autres déchets de l’organisme). Elle est employée pour prendre en charge les pathologies qui affectent l’appareil urinaire : calculs (lithiases), néphrites (inflammation des reins), cystites (inflammation de la vessie), oliguries (volume d’urines anormalement faible), troubles de la prostate et coliques néphrétiques (douleurs au niveau des reins provoquées par une obstruction urinaire). Elle agit efficacement contre les rhumatismes et les calculs biliaires. Grâce à son effet émollient (adoucissant), la pariétaire est aussi indiquée en usage externe pour soigner les contusions, les hémorroïdes, les plaies, les brûlures, les abcès et les furoncles.\n",
                "Parties utilisées: La plante entière.\n",
                "Posologie :\n"+
                        "En usage interne :\n" +
                        "Contre les troubles urinaires. Infusion : 20 g de feuilles de pariétaire, 20 g de fleurs de sureau et 40 g de vergerette du Canada. Faire bouillir 1 cuillère à soupe du mélange pour 1 tasse d’eau. Laisser infuser 20 minutes. Boire 3 tasses par jour, entre les repas. Suc : Entre 25 et 10 g par jour. A prendre en plusieurs fois au cours de la journée. En usage externe Contre les hémorroïdes et les lésions cutanées (plaies, contusions, abcès, brûlures, furoncles). Cataplasmes : Faire bouillir et filtrer. Placer la plante entre deux linges et appliquer directement sur les lésions.\n",
                " Précautions d'emploi :\n"+
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Passiflore",
                "passiflore",
                "Nom latin: Passiflora incarnata.\n",
                "Famille: Passifloracées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Les principales indications de la passiflore sont les troubles du sommeil et de l’endormissement, l’insomnie, la tension nerveuse, l’agitation et l’irritabilité. Une étude iranienne publiée en 2001 et menée auprès de 36 sujets souffrant d’anxiété généralisée a démontré l’efficacité de la plante contre ce trouble (1). La plante peut aussi être utilisée pour soigner les troubles digestifs d’origine nerveuse.\n" ,
                "Parties utilisées: Les parties aériennes.\n",
                "Posologie :\n"+
                        "En usage interne :\n" +
                        "Contre l’insomnie, les troubles du sommeil\n" +
                        "Infusion : 1 cuillère à café de plante séchée dans une tasse d’eau bouillante. Infuser 5 à 10 min et filtrer. Boire une tasse au coucher. \n" +
                        "Ou \n" +
                        "Teinture-Mère : 25 à 75 gouttes dans un verre d’eau, au coucher. \n" +
                        "Ou \n" +
                        "Poudre : 2g le soir au coucher.\n" +
                        "Contre les troubles de l’endormissement\n" +
                        "Infusion : 1 cuillère à café de plante séchée dans une tasse d’eau bouillante. Infuser 5 à 10 min et filtrer. Boire deux tasses au coucher. \n" +
                        "Ou \n" +
                        "Teinture-Mère : 50 gouttes dans un verre d’eau, au coucher. \n" +
                        "Ou \n" +
                        "Poudre : 4g le soir au coucher.\n" +
                        "Contre l’anxiété, les troubles de la nervosité, les palpitations\n" +
                        "Infusion : 1 cuillère à café de plante séchée dans une tasse d’eau bouillante. Infuser 5 à 10 min et filtrer. Boire une tasse, trois fois par jour. \n" +
                        "Ou \n" +
                        "Teinture-Mère : 25 gouttes dans un verre d’eau, trois fois par jour. \n" +
                        "Ou \n" +
                        "Poudre : 2g, trois fois par jour juste avant les repas.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "La passiflore, utilisée aux doses recommandées, n’a pas présenté à ce jour de toxicité. Son utilisation est contre-indiquée chez la femme enceinte et allaitante.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamaiss dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Pavot",
                "pavot",
                "Nom latin: Papaver somniferum album.\n",
                "Famille: Papavéracées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Le pavot contient un latex, l’opium, qui renferme une vingtaine d’alcaloïdes, dont la morphine et la codéine. Il est essentiellement utilisé pour son effet sédatif, autrement dit pour apaiser les douleurs. Cette plante a aussi des propriétés antispasmodiques (elle prévient les contractions musculaires volontaires), hypnotiques (elle endort), béchiques (elle traite la toux sèche) et antidiarrhéiques. On l’emploie pour lutter contre tous les types de douleurs (y compris les tumeurs et les névralgies), les insomnies, l’anxiété, les diarrhées, les dysenteries (infections bactériennes accompagnées de diarrhées) et les maladies pulmonaires.\n",
                "Parties utilisées: Les feuilles et les têtes (sans les graines).\n",
                "Posologie :\n" +
                        "La plante s'utilise en usage interne ou externe (gargarismes ou injections vaginales). Demander conseil à un médecin ou pharmacien spécialisé.\n",
                " Précautions d'emploi :\n"+
                        "Le pavot est contre-indiqué chez les personnes atteintes de tuberculose, d’une maladie infectieuse, d’un syndrome congestif ou qui ont des problèmes de perméabilité rénale. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Pêcher",
                "pecher",
                "Nom latin: Prunus persica.\n",
                "Famille: Rosacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n"+
                        "Grâce à son action purgative, le pêcher est un laxatif doux utilisé pour lutter contre la constipation, en particulier chez les enfants. Il possède également des propriétés antispasmodiques (il prévient les contractions musculaires involontaires), vermifuges (il fait baisser la fièvre) et diurétiques (il améliore le fonctionnement de l’appareil urinaire). Outre la constipation, le pêcher est indiqué dans la prise en charge de l’arthrite, de troubles urinaires (goutte, calculs, rétention), de la coqueluche, de l’anxiété et des insomnies. Il agit efficacement contre certaines infections d’origine parasitaire telles que l’oxyurose. En usage externe, il sert également à soigner les contusions et les brûlures.\n",
                "Parties utilisées: Les fleurs et les feuilles.\n",
                "Posologie :\n"+
                        "\tEn usage interne :\n" +
                        "Contre les crises de colère chez les enfants. Infusion : Faire bouillir 1 pincée e fleurs ou 1 cuillère à café (selon l’âge de l’enfant) pour 1 tasse d’eau. Laisser infuser pendant 10 minutes. Boire entre ½ et 2 tasses par jour. Contre la constipation (enfants). Réaliser la même infusion avec 60 g de fleurs pour 1 litre d’eau. Ou Sirop : Laisser macérer 100 g de fleurs dans 1 litre d’eau pendant 12 heures. Faire bouillir, filtrer et exprimer. Ajouter du sucre (même poids que le sirop). Prendre 1 à 3 cuillères à café avant de se coucher. Contre la constipation et les problèmes de transit intestinal. Décoction : Placer des feuilles fraîches sous de l’eau froide. Faire bouillir 60 g pour 1 litre d’eau.\n" +
                        "\tEn usage externe:\n" +
                        "Contre les contusions et les brûlures. Cataplasmes : Hacher les feuilles, verser de l’huile d’olive et du persil. Placer le mélange entre deux linges et appliquer directement sur les lésions. Contre l’oxyurose des enfants. Cataplasmes : Broyer des feuilles, des fleurs et des amandes. Placer le mélange obtenu entre deux linges et appliquer sur le ventre.\n",
                " Précautions d'emploi :\n"+
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Pélargonium",
                "pelagronium",
                "Nom latin: Pelargonium graveolens, Pelargonium roseum.\n",
                "Famille: Géraniacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Plante aux nombreuses propriétés, le pélargonium exerce une action anti-inflammatoire, expectorante (il dégage les voies respiratoires), émolliente (il adoucit la peau), antalgique (il soulage les douleurs), cicatrisante, antibactérienne et antifongique (il soigne les infections causées par des champignons). Il est utilisé en usage externe pour prendre en charge la grippe, les rhumes, les angines, les bronchites, les infections et mycoses buccales ainsi que les douleurs articulaires (rhumatismes, arthrite). Il guérit les plaies, les brûlures légères et les hémorroïdes, apaise les symptômes des piqûres d’insectes. Le pélargonium est aussi employé pour traiter le stress, l’anxiété et la grande fatigue (asthénie). Il agit efficacement contre les dermatoses telles que l’acné, la couperose, l’eczéma et l’impétigo. Il contribue à lutter contre le vieillissement cellulaire (effet antioxydant) et à prévenir les cancers. Cette plante est très bien tolérée par les enfants.\n",
                "Parties utilisées:  Les feuilles et l'huile essentielle.\n",
                "Posologie :\n" +
                        "Utilisation Interne :\n" +
                        "Pas d'utilisation interne.\n" +
                        "Utilisation Externe :\n" +
                        "Antibactérien et cicatrisant : traite les plaies et les brûlures superficielles au moyen de cataplasmes.\n" +
                        "Calme les zones affectées par les piqûres d'insectes. Effet expectorant : grippe, rhume, bronchite et autres affections respiratoires. Diminue les symptômes de l'angine (tisanes). En gargarisme, pour les infections de la gorge et de la bouche. Combat les mycoses. Léger effet anti-inflammatoire : pour les douleurs articulaires.\n" +
                        "Indications Thérapeutiques Usuelles :\n" +
                        "Contribue au traitement des problèmes de peau (acné, eczéma, vergetures, couperose). Traite les dermatoses et la peau irritée. Apaise les symptômes liés à des affections respiratoires.\n" +
                        "Autres Indications Thérapeutiques Démontrées :\n" +
                        "Aide à la cicatrisation des plaies. En massages, en cas de grande fatigue, d'asthénie ou de stress. En cataplasmes, pour traiter les hémorroïdes.\n",
                " Précautions d'emploi :\n"+
                        "L’huile essentielle de pélargonium est déconseillée pendant le premier trimestre de la grossesse.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Persil",
                "persil",
                "Nom latin: .",
                "Famille: Petroselinum crispum.\n",
                "Type:Feuille.",
                "Propriétés :\n"+
                        "Le persil est souvent utilisé en cuisine pour relever les plats ou les salades, mais il est aussi apprécié en phytothérapie pour ses nombreux bienfaits. Riche en vitamines (A, B, C, E, K) et en minéraux, il est surtout employé pour son effet diurétique (il améliore le fonctionnement de l’appareil urinaire) dans la prise en charge des calculs rénaux (lithiases), des œdèmes, des rétentions d’eau et de la goutte. Il possède également une propriété anti-oxydante (il ralentit le vieillissement cellulaire), stomachique (il facilite la digestion) et antispasmodique (il prévient les contractions musculaires involontaires). Il est indiqué dans le traitement des troubles digestifs (problèmes de digestion) et du cycle menstruel (absence de règles, règles douloureuses). Grâce à son effet anti-hypertenseur, il est recommandé aux personnes qui ont la tension artérielle anormalement élevée (hypertension).\n",
                "Parties utilisées: Les feuilles, les fruits, la plante entière et l’huile essentielle.\n",
                "Posologie :\n"+
                        "Utilisation Interne :\n" +
                        "Anticancéreux, le persil offre une action bénéfique sur le foie, la rate, les intestins et le système digestif. Il traite les troubles intestinaux et a un effet antiparasitaire. Utile en cas de coliques néphrétiques, d’infections urinaires, de ballonnements, d’indigestions, de constipation ; il agit sur les troubles cardiaques (hypertension, mauvaise circulation sanguine, battements cardiaques accélérés), les troubles respiratoires (maladies respiratoires chroniques, saisonnières, infectieuses, telles que l'asthme, la dyspnée) et les troubles menstruels chez la femme (aménorrhées, dysménorrhées, déclencheur des menstruations). Il possède un effet antioxydant, grâce à sa forte teneur en vitamines A, B, C, E, K et en sels minéraux, favorisant la croissance chez l'enfant et ralentissant le vieillissement des cellules et des tissus. C'est un aromatisant qui a de nombreux effets sur l'hygiène bucco-dentaire et permet de lutter contre la mauvaise haleine et certains malaises dus à l'abus d'alcool.\n" +
                        "Utilisation Externe :\n" +
                        "Antidouleur : cicatrisation des plaies, élimination des oedèmes, contusions. Affections dermatologiques : eczéma, acné. Cosmétiques : cernes, paupières gonflées, traitements de la chevelure, teint trop mat, antirides.\n" +
                        "Indications Thérapeutiques Usuelles :\n" +
                        "Hypertension artérielle, douleurs articulaires et fatigue, anxiété, infections cutanées, rides, eczéma. Prévention des maladies chroniques et saisonnières des voies respiratoires : toux, asthme, bronchites. Le persil a des effets antianémiques et anticoagulants. Il sert ainsi à provoquer ou à régulariser les menstruations.\n" +
                        "Autres Indications Thérapeutiques Démontrées :\n" +
                        "Les feuilles fraîches du persil sont riches en vitamines et en minéraux. Comportant également des flavonoïdes, elles constituent un excellent anti-inflammatoire et un très bon antioxydant. Les feuilles concassées ainsi que les graines servent à désinfecter et à adoucir les piqûres d'insectes. Inhibant la sécrétion d'histamine, il peut être utilisé en cas d' allergie. Comme il contient beaucoup de chlorophylle, il est parfait pour rafraîchir l'haleine.\n" ,
                " Précautions d'emploi :\n"+
                        "Le persil est contre-indiqué pendant la grossesse et l’allaitement, car il augmente le risque d’avortement (effet abortif) et diminue la lactation. L’usage de cette plante doit être modéré car elle peut entraîner des congestions vasculaires, des inflammations rénales et des spasmes en cas de surdosage.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(

                "Pervenche (Petite)",
                "pervenche",
                "Nom latin: Vinca menor.\n",
                "Famille: Apocynacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Les feuilles de la petite pervenche contiennent de la vincamine, une substance active qui favorise l’apport en oxygène et la circulation sanguine au niveau du cerveau. Cette molécule fait baisser la tension artérielle (effet hypotenseur) et augmente le calibre des vaisseaux sanguins (effet vasodilatateur). La pervenche est indiquée chez les personnes qui souffrent d’insuffisance circulatoire cérébrale (ICC), une pathologie qui entraîne des maux de tête, des vertiges et des troubles de la vision. Elle est aussi employée en cas d’accident vasculaire cérébral, de traumatisme crânien ou après une chirurgie de l’œil. Cette plante permet de soulager plusieurs symptômes liés au vieillissement : perte de mémoire, problèmes de concentration, étourdissements, bourdonnements...\n" ,
                "Parties utilisées: Les feuilles.\n",
                "Posologie :\n"+
                        "En usage interne :\n" +
                        "Contre l’insuffisance circulatoire cérébrale et les symptômes liés au vieillissement . Gélules (290 mg) : 3 gélules par jour. Prendre 1 gélule au cours de chaque repas.\n" +
                        "Contre les bourdonnements (acouphène). Infusion : Mélanger 50 g de feuilles de petite pervenche, 50 g feuilles de ginkgo biloba et 50 g de rhizomes de fragon. Faire bouillir 1 cuillère à soupe pour 1 tasse d’eau pendant 3 minutes. Laisser infuser 10 minutes. Boire 2 à 3 tasses par jour. Durée du traitement : au moins 6 mois (3 semaines par mois).\n" +
                        "Pour prévenir l’artériosclérose. Infusion : Mélanger 50 g de petite pervenche (feuilles), 50 g de ginkgo biloba (feuilles), 50 g d’aubépine (fleurs et feuilles) et 50 g de chrysantellum (plante entière). Faire bouillir 1 cuillère à soupe pour 1 tasse d’eau pendant 3 minutes. Laisser infuser 10 minutes. Boire 2 à 3 tasses par jour. Durée du traitement : au moins 6 mois (3 semaines par mois).\n",
                " Précautions d'emploi :\n"+
                        "La petite pervenche est contre-indiquée chez les femmes atteintes d’une affection du sein (cancer, kyste). Elle ne doit pas être prise en association avec certains médicaments, notamment les laxatifs stimulants et les antirythmiques. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(

                "Piloselle",
                "piloselle",
                "Nom latin: Hieracium pilosella.\n",
                "Famille: Astéracées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Diurétique, la piloselle facilite l’élimination rénale de l’eau, de l’acide urique et de l’urée. Elle est ainsi souvent prescrite en cas de rétention d’eau et d’œdème des membres inférieurs. Elle favorise aussi l’élimination hépatique et digestive en stimulant la vésicule biliaire. Elle peut parfois être indiquée en complément pour soigner une hypertension artérielle. Enfin, des études ont démontré l’intérêt de la plante pour soigner les brucelloses, une maladie touchant le bétail mais pouvant se communiquer à l’homme par contagion directe ou voie digestive (1).\n",
                "Parties utilisées: La plante entière avec la racine.\n",
                "Posologie :\n"+
                        "En usage interne :\n" +
                        "Contre la rétention d’eau, l’œdème et pour activer l’élimination hépatique et digestive\n" +
                        "Infusion : 10g de feuilles séchées pour 1 litre d’eau bouillante. Infuser 10 min et filtrer. Boire 1 tasse matin et midi, avant les repas. \n" +
                        "Ou \n" +
                        "Extrait sec en gélules : 1 gélule de 200mg matin et midi, au moment des repas. \n" +
                        "Ou \n" +
                        "Teinture-mère : 50 gouttes, à prendre matin et midi dans un verre d’eau, au moment des repas. \n" +
                        "Ou \n" +
                        "Extrait fluide : 30 gouttes, à prendre matin et midi dans un verre d’eau, au moment des repas.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "La piloselle ne présente aucune contre-indication ni toxicité connue à ce jour, aux doses recommandées.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(

                "Piment",
                "piment",
                "Nom latin: Capsicum annuum.\n",
                "Famille: Solanacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n"+
                        "Le piment favorise les sécrétions gastriques. Stimulant les contractions intestinales, il accélère l'élimination de contenu du système digestif. Selon la dose utilisée, il présente, en usage externe, une action analgésique et anti-inflammatoire, ou révulsive et congestionnante. En application locale, il peut traiter toutes sortes de symptômes inflammatoires : myalgies (douleurs musculaires), arthrites (douleurs articulaires), lumbagos, arthrites, affestions nerveuses consécutives à un herpès et mastodynies (douleurs au niveau du sein) postopératoires. Il peut également être utilisé sous forme de cataplasme sur le cuir chevelu pour lutter contre la chute de cheveux.\n",
                "Parties utilisées: Le fruit.\n",
                "Posologie :\n"+
                        "Quel que soit la forme de la préparation, seul un médecin peut déterminer un traitement à base de piment.\n" ,
                " Précautions d'emploi :\n"+
                        "Pourtant mieux tolérés que ceux à base de moutarde, les cataplasmes de piment doivent impérativement faire l'objet d'une prescription médicale, tout comme les pommades et autres préparations réalisées à partir d'extrait de la plante.\n"

        );
        sqLiteHelper.insertData(

                "Pissenlit",
                "pissenlit",
                "Nom latin: Taraxacum officinale.\n",
                "Famille: Astéracées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Les feuilles de pissenlit sont réputées pour favoriser l’élimination de l’urine. Elles peuvent ainsi être utilisées en cas de rhumatismes et dans la prévention des calculs rénaux. Cet effet a notamment été mis en évidence dans des essais menés sur des animaux dans les années 2000 (1). La plante augmenterait aussi l’élimination de l’eau et peut ainsi être conseillée en cas de rétention, d’insuffisance rénale, de cellulite ou encore d’obésité. Des recherches menées en 2006 ont également mis en avant les bienfaits anti-oxydants, anti-cancer et anti-diabète du pissenlit (2). D’autres recherches ont indiqué que le pissenlit pouvait soulager les crampes intestinales, la constipation et la diarrhée (3).\n",
                "Parties utilisées: La racine et les feuilles.\n",
                "Posologie :\n"+
                        "En usage interne :\n" +
                        "Contre la rétention d’eau, l’insuffisance rénale, la cellulite, l’obésité, les calculs rénaux\n" +
                        "Infusion : 1 sacht-dose (racine ou feuille) pour 1 tasse d’eau bouillante. Infuser 10 min. Filtrer et boire 2 tasses par jour, 1h après les deux principaux repas.\n" +
                        "Ou \n" +
                        "Extrait buvable : 1 ampoule après le repas de midi.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "Le pissenlit est contre-indiqué en cas d’occlusion des voies biliaires, d’obstruction intestinale, de calculs biliaires ou d’ulcères du duodénum. En cas d’insuffisance rénale ou de troubles cardiaques, consulter un médecin avant la prise de pissenlit.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Pivoine",
                "pivoine",
                "Nom latin: Paeonia officinalis.\n",
                "Famille: Paeoniacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "La pivoine est appréciée en phytothérapie pour ses propriétés analgésiques (elle apaise les douleurs), anti-inflammatoires, antibactériennes et antispasmodiques (elle prévient les contractions musculaires involontaires). Elle est utilisée dans la prise en charge de nombreuses affections telles que les troubles digestifs (reflux gastro-œsophagien, gastrite, problème de digestion), les migraines, les troubles nerveux, les douleurs dorsales, les torticolis, les rhumatismes, la coqueluche et les spasmes. La pivoine est aussi employée en gynécologie en cas d’absence de règles ou de règles douloureuses. En usage externe, elle agit contre les lésions cutanées associées à l’eczéma.\n",
                "Parties utilisées: La racine.\n",
                "Posologie :\n"+
                        "En usage interne :\n" +
                        " Contre les rhumatismes, les troubles digestifs et du cycle menstruel. Décoction : Placer dans de l’eau froide entre 2 et 3 g de racines hachées pour 1 tasse d’eau. Faire bouillir pendant 15 minutes et filtrer. Boire 3 tasses par jour, 1 tasse avant chaque repas. Contre les troubles nerveux. Infusion : Faire bouillir 1 cuillère à café de racines hachées pour 1 tasse d’eau, pendant 15 minutes. Laisser infuser entre 5 et 10 minutes et filtrer. Boire 3 tasses par jour, 1 tasse avant chaque repas. En usage externe Contre l’eczéma et les rhumatismes. Compresses : Réaliser la décoction indiquée en usage interne. Imbiber un linge et appliquer directement sur les lésions, 2 ou 3 fois par jour.\n",
                " Précautions d'emploi :\n"+
                        "Un surdosage peut entraîner des nausées et des diarrhées. La pivoine est déconseillée pendant la grossesse et l’allaitement. Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(

                "Poirier",
                "poirier",
                "Nom latin: Pirus communis.\n",
                "Famille: Rosacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n"+
                        "Les propriétés du poirier sont semblables à celles de la busserole. Il est surtout utilisé pour son action diurétique. Il est indiqué dans la prise en charge de la goutte, des infections urinaires telles que les cystites (inflammation de la vessie) et les colibacilloses (infection bactérienne), des oliguries (volume d’urines anormalement faible) et des calculs urinaires (lithiases). Le poirier contribue aussi à prévenir l’apparition de pus (effet antiputride). En usage externe, il facilite la cicatrisation des plaies et des ulcères.\n",
                "Parties utilisées: L’écorce et les feuilles des jeunes rameaux.\n",
                "Posologie :\n"+
                        "En usage interne :\n" +
                        "Contre les troubles urinaires ou de la prostate et les calculs. Infusion : Faire bouillir 50 g de feuilles pour 1 litre d’eau pendant 2 minutes. Laisser infuser 10 minutes. Boire entre 2 et 4 tasses par jour.\n" +
                        "Contre les calculs urinaires . Infusion : Faire bouillir 50 g de feuilles de poirier et 50 g de pelures de pommes séchées pour 1 litre d’eau. Boire à volonté jusqu’à l’apaisement des symptômes. En usage externe. Pour soigner les plaies et les ulcères. Décoction : Placer 50 g d’écorce dans de l’eau froide, puis faire bouillir dans 1 litre d’eau. Appliquer directement sur les lésions.\n",
                " Précautions d'emploi :\n"+
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(

                "Polygala De Virginie",
                "polygaladeverginie",
                "Nom latin: Polygala senega.\n",
                "Famille: polygalacées.\n",
                "Type:Plante.",
                "Propriétés :\n"+
                        "La racine du polygala a des vertus exporantes reconnues, stimulant l'élimination des mucosités. Elle est prescrite en cas d'inflammations bronchiques et pour soigner la toux. Anti-inflammatoire et laxative, elle est administrée sous forme de sirop aux enfants présentant une toux grasse ou souffrant de constipation légère. Elle favorise la sécrétion salivaire, la transpiration et l'élimination rénale de l'eau. Elle permettrait de réduire les taux de cholestérol, de triglycérides et de glucose dans le sang. Récemment, des propriétés anti-inflammatoires lui ont été attribuées, permettant d'envisager à l'avenir de l'utiliser contre l'eczéma et le psoriasis. Mais toutes les espèces de polygala ne présentent pas les mêmes propriétés. Celles originaires d'Asie ou d'Afrique du Nord sont connues pour stimuler la lactation.\n",
                "Parties utilisées: La racine.\n",
                "Posologie :\n"+
                        "En usage interne :\n" +
                        "En cas de toux et d'inflammations bronchiques\n" +
                        "Décoction : 0,5 g de racine pour 15 cl d'eau ou 1 cuillère à café pour 75 cl. 2 ou 3 tasses par jour.\n" +
                        "Ou\n" +
                        "Infusion : 10 g de racine pour 1 l d'eau bouillante. Infuser 10 min. 3 à 4 tasses par jour.\n" +
                        "Ou\n" +
                        "Gélules dosées à 40 mg de poudre : 3 à 6 par jour.\n" +
                        "Ou\n" +
                        "Teinture : 30 à 40 gouttes dans un verre d'eau, 3 à 6 fois par jour.\n" +
                        "Ou\n" +
                        "Extrait fluide : 20 gouttes, 2 à 4 fois par jour.\n" +
                        "En cas de constipation légère ou de toux grasse chez l'enfant\n" +
                        "Sirop : 3 ou 4 cuillères à café par jour\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "Le polygala de Virginie présente une très faible toxicité. Des manifestations digestives type nausées ont été notées dans certains cas, rares et uniquement lors de surdosages excessifs ou de cures prolongées. La racine peut être utilisée fraîche, mais elle se révèle irritante par voie orale.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(

                "Quinquina Rouge",
                "quiquina",
                "Nom latin: Cinchona succirubra.\n",
                "Famille: Rubiacées.\n",
                "Type:Plante.",
                "Propriétés :\n"+
                        "Le quinquina rouge fait partie de la grande famille des quinquina (Cinchona) qui compterait environ 30 espèces différentes. Son écorce est réputée pour stimuler les sécrétions digestives et l’appétit. Elle possède aussi un effet anti-infectieux, d’où sa prescription en cas d’état grippal, et astringent. Cette propriété en fait un traitement précieux en cas d’escarres et de plaies atones (stabilisées). Enfin, la plante contient de la quinine et de la quinidine réputée pour soigner la fièvre (notamment en cas de paludisme) et les troubles du rythme cardiaque comme l'arythmie (1)…\n",
                "Parties utilisées: L’écorce.\n",
                "Posologie :\n"+
                        "En usage interne :\n" +
                        "Contre le manque d’appétit, l’asthénie, les troubles digestifs\n" +
                        "Teinture : 2 à 4g dans un verre d’eau, 2 à 4 fois par jour. \n" +
                        "Ou \n" +
                        "Vin médicinal : 1 à 2 cuillères à soupe, 3 fois par jour\n" +
                        "Contre les états fébriles, les affections grippales\n" +
                        "Décoction : 0,5g d’écorce finement coupée pour 1 tasse d’eau. Laisser bouillir 2 à 3min. Infuser 10 min. Boire 2 ou 3 tasses par jour, 30 min avant les repas. \n" +
                        "Ou \n" +
                        "Gélules dosées à 150mg d’extrait sec : 2 ou 3 par jour.\n" +
                        "En usage externe:\n" +
                        "Contre les escarres, les plaies atones\n" +
                        "Décoction: 30g d’écorce hachée pour 1 litre d’eau. En lavage, 1 ou 2 fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "La prise de quinquina ne doit pas se faire en association avec des anticoagulants car il potentialise leur effet. Le quinquina est contre-indiqué en cas de grossesse et d’hypersensibilité à la quinine et à la quinidine (allergie cutanée...).\n"

        );
        sqLiteHelper.insertData(

                "Réglisse",
                "reglisse",
                "Nom latin: Glycyrrhiza glabra.\n",
                "Famille: Fabacées.\n",
                "Type:Plante.",
                "Propriétés :\n" +
                        "La réglisse peut être utilisée pour soigner des ulcères de l’estomac puisqu'elle réduit les sécrétions d’acides et a une action anti-inflammatoire. Un essai mené pendant deux ans auprès de 82 personnes a démontré que l’extrait de réglisse déglycyrrhizinée, associé à un extrait de fenouil et à des antiacides, était aussi efficace que la cimétidine (médicament classique) pour prévenir la récidive des ulcères gastriques (1). La réglisse pourrait aussi prévenir l’ulcère gastro-duodénal en contrant la bactérie Helicobacter pylori (2). D’une manière plus générale, la réglisse peut être prescrite contre divers troubles digestifs tels que les ballonnements, les flatulences et éructations, et la digestion lente. Parmi ses autres vertus, elle serait expectorante, antitussive et hépato-protectrice. Enfin, des recherches ont mis en évidence que la réglisse pourrait être efficace contre le cancer (3), l’eczéma, le psoriasis et l’herpès simplex (4).\n",
                "Parties utilisées: La racine.\n",
                "Posologie :\n"+
                        "En usage interne:\n" +
                        "Contre les troubles digestifs\n" +
                        "Décoction: 1 à 1,5g de racine mondée pour 1 tasse d’eau froide. Porter à ébullition et laisser bouillir pendant une dizaine de minutes. Boire 2 tasses par jour pendant les repas.\n" +
                        "Le traitement ne doit pas dépasser 4 à 6 semaines, veillez à observer une pause d'un mois entre deux traitements.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "La prise de réglisse est contre-indiquée en cas d’hypertension, d’insuffisance cardiaque ou hépatique et de grossesse. Par ailleurs, un traitement à base de réglisse doit être associé à une alimentation pauvre en sel (risque de rétention d’eau et du sodium).\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(

                "Ricin",
                "ricin",
                "Nom latin:  Ricinus communis.\n",
                "Famille:  Euphorbiacées.\n",
                "Type:Fruit/Légume.",
                "Propriétés :\n"+
                        "Le ricin est une plante ayant un fort effet laxatif. Elle est ainsi utilisée en cas de constipation passagère et se présente en général sous la forme d’une huile.\n",
                "Parties utilisées: L’huile des graines.\n",
                "Posologie :\n"+
                        "La graine de ricin contient une substance soluble dans l'eau et sensible à la chaleur, très toxique. Il est donc déconseillé de fabriquer soi-même ses propres remèdes. Mieux vaut acheter les médicaments ou huiles à base de ricin prêts à l’emploi en pharmacie.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "La prise du ricin est contre-indiquée en cas de troubles au niveau des voies biliaires et de grossesse. Il faut éviter de consommer l'huile de ricin pendant plusieurs semaines et régulièrement (risque d’anorexie, de troubles digestifs). Demandez conseil à un pharmacien ou un médecin avant toute prise.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Romarin",
                "romarin",
                "Nom latin: Rosmarinus officinalis.\n",
                "Famille: Lamiacées.\n",
                "Type:Plante.",
                "Propriétés :\n"+
                        "Le romarin est riche en composants puissants (huile essentielle, acide rosmarinique, flavonoïdes…). Il est antiseptique, anti-inflammatoire et fluidifiant. Il est utile contre la toux, mais aussi en cas de troubles digestifs (diarrhées, spasmes, flatulences) ou de rhumatismes et il a des propriétés diurétiques.\n",
                "Parties utilisées: Les feuilles et fleurs.\n",
                "Posologie :\n"+
                        "EN Usage Intrne:\n" +
                        "Contre le rhume, la toux et les troubles digestifs\n" +
                        "Infusion : faites infuser 5 g de feuilles dans une tasse d’eau bouillante, 10 min. Filtrer. 2 à 3 tasses par jour.7 jours en traitement curatif.et/ou10 jours par mois, 2 mois de suite au début de l’automne en prévention. \n" +
                        "Ou \n" +
                        "Teinture Mère (TM) : 10 à 20 gouttes diluées dans un grand verre d’eau, matin et soir.7 jours en traitement curatif.et/ou10 jours par mois, 2 mois de suite au début de l’automne en prévention.\n" +
                        "Par Voie Externe:\n" +
                        "\n" +
                        "Contre les rhumatismes\n" +
                        "Lotion : bouillir 50 g de fleurs dans un litre d’eau, 2 min. Laisser infuser 10 min. Filtrer. Imbiber un linge de cette préparation et appliquer sur les articulations douloureuses, 2 à 3 fois par jour.1 semaine en curatif.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.",
                " Précautions d'emploi :\n"+
                        "Le romarin peut aggraver les crises migraineuses. Attention, son huile essentielle (HE) peut avoir des effets convulsifiants. La plante est contre-indiquée chez l’enfant de moins de 6 ans et chez la femme enceinte ou allaitante.\n"

        );
        sqLiteHelper.insertData(
                "Sauge Sclarée",
                "saugesclaree",
                "Nom latin:  Salvia sclarea.\n",
                "Famille:  Lamiacées.\n",
                "Type:Feuille.",
                "Propriétés :\n"+
                        "La sauge sclarée possède plusieurs propriétés intéressantes. Elle fait baisser ou augmente le taux de glucose dans le sang (glycémie) selon la dose administrée, ce qui en fait un allié précieux dans la lutte contre l’hypoglycémie et l’hyperglycémie. Elle est indiquée en gynécologie pour soulager les douleurs pendant les règles, réguler le cycle menstruel et apaiser les symptômes de la ménopause comme les bouffées de chaleur et la transpiration excessive. Les graines sont parfois employées pour expulser les corps étrangers logés dans l’œil.\n",
                "Parties utilisées: Les feuilles, l’huile essentielle et les graines.\n",
                "Posologie:\n"+
                        "En Usage iInterne:\n" +
                        "Contre les symptômes de la ménopause (bouffées de chaleur, transpiration excessive). \n" +
                        "Teinture : 80 à 100 gouttes par jour à diluer dans verre d’eau, 2 fois par jour (matin et soir). \n" +
                        "Ou \n" +
                        "Gélules (500 mg) : 1 ou 2 gélules par jour (matin et soir). \n" +
                        "Contre la transpiration excessive. \n" +
                        "Bain antisudoral : Faire bouillir de l’huile essentielle de sauge sclarée dans 1 ou 2 litres d’eau et laisser infuser entre 15 et 20 minutes. Filtrer et verser la préparation dans le bain. \n" +
                        "N.B. : Verser 10 gouttes d’huile essentielle dans l’eau bouillante pour un bain de pieds, 20 gouttes pour un bain complet. Mélanger les gouttes dans un dispersant avant de les verser dans l’eau. \n" +
                        "En Usage Externe \n" +
                        "Contre les corps étrangers logés dans l’œil. \n" +
                        "Placer une graine de sauge sclarée sous la paupière. Elle fera gonfler cette dernière et entraînera un larmoiement. Une fois le corps étranger expulsé, retirez la graine avec précaution.\n" +
                        "En cas de doute sur la posologie, demander conseil à un médecin ou pharmacien spécialisé en phytothérapie.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.",
                " Précautions d'emploi :\n"+
                        "La sauge est déconseillée aux femmes enceintes, qui allaitent ou qui ont développé par le passé un cancer du sein hormono-dépendant. Elle ne doit pas être administrée en association avec un antiépileptique ni en cas d’insuffisance rénale. Un surdosage peut entraîner des vertiges et des bouffées de chaleur.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Séné",
                "sene",
                "Nom latin:  Cassia senna (séné d’ Alexandrie), Cassia angustifolia (séné d’Inde).\n",
                "Famille:  Fabacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "Le séné est une plante réputée pour ses effets laxatifs. Il s’emploie ainsi dans le traitement de la constipation quand les mesures diététiques (fibres…) ne sont pas suffisantes.\n",
                "Parties utilisées: Les feuilles et les gousses.\n",
                "Posologie :\n"+
                        "Seul un médecin est habilité à déterminer la posologie adéquate du séné. Des doses très élevées peuvent engendrer une diarrhée et des douleurs abdominales.\n",
                " Précautions d'emploi :\n"+
                        "Un traitement au séné ne doit jamais dépasser 10 jours. Il est contre-indiqué en cas de grossesse, d’allaitement, de traitement digitalique et chez l’enfant de moins de 12 ans. Il est formellement déconseillé en cas de maladie inflammatoire du côlon, de syndrome occlusif ou de douleurs abdominales inexpliquées.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Thuya",
                "thuya",
                "Nom latin:  Thuya occidentalis.\n",
                "Famille:  Cupressacées.\n",
                "Type:Feuille.",
                "Propriétés :\n"+
                        "Le thuya est apprécié en phytothérapie pour ses rameaux, d’où est extraite l’huile essentielle. Il a une propriété anti-inflammatoire, anti-infectieuse, antitumorale (il prévient les cancers), diurétique (il améliore le fonctionnement de l’appareil urinaire) et emménagogue (il provoque les règles). Le thuya est surtout utilisé dans la prise en charge de l’incontinence (fuites urinaires), des hypertrophies de la prostate et des infections urinaires telles que la cystite (inflammation de la vessie). Cette plante est employée en usage externe pour traiter les tumeurs bénignes (verrues, papillomes, polypes), les rétentions d’eau, les inflammations des organes génitaux et les règles douloureuses. Au Canada, le thuya s’applique sur la peau sous forme de cataplasme pour soulager les douleurs rhumatismales.\n",
                "Parties utilisées: Les rameaux séchés, l’huile essentielle extraite des rameaux.\n",
                "Posologie :\n"+
                        "Thuya 9 CH, 12 CH ou 15 CH, une fois par jour pour rééquilibrer toute pathologie dysimmunitaire, un processus d’accumulation. Espacer les prises puis arrêter selon l’amélioration.\n",
                " Précautions d'emploi :\n"+
                        "L’effet emménagogue du thuya est très puissant et peut provoquer des avortements.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Tilleul",
                "tileul",
                "Nom latin: Tilia cordata, Tilia platyphyllos.\n",
                "Famille:  Tiliacées.\n",
                "Type:Plante.",
                "Propriétés :\n"+
                        "Le tilleul est réputé pour ses vertus sédatives et spasmolytiques. Il est ainsi recommandé pour soigner les troubles légers du sommeil. En usage externe, la plante est utilisée comme adoucissant et anti démangeaisons contre les crevasses, les gerçures, les piqûres d’insecte et les irritations cutanées. Enfin, elle peut être indiquée pour stimuler la sécrétion et l’élimination de la bile en cas d’insuffisance hépatique digestive, de calculs biliaires et de ballonnements.\n",
                "Parties utilisées: Les inflorescences et l’aubier..\n",
                "Posologie :\n"+
                        "En Usage Interne:\n" +
                        "Contre les troubles légers du sommeil\n" +
                        "Infusion : 5g d’inflorescences séchées pour 1 litre d’eau bouillante. Infuser 5 min et filtrer. Boire 1 tasse le soir.\n" +
                        "Contre l’insuffisance hépatique digestive, les calculs biliaires, les ballonnements\n" +
                        "Gélule de poudre d’aubier : 1 matin, midi et soir avec un grand verre d’eau.\n" +
                        "En Usage Externe:\n" +
                        "Contre les crevasses, gerçures, piqûres d’insecte, irritations cutanées\n" +
                        "Solution à base d’inflorescences : Appliquer localement plusieurs fois par jour.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "A ce jour et aux doses recommandées, le tilleul n’a présenté aucune toxicité.\n" +
                        "Attention : Les plantes ne sont pas des remèdes anodins. Ne jamais dépasser les doses indiquées.\n"

        );
        sqLiteHelper.insertData(
                "Valériane",
                "valeriane",
                "Nom latin:  Valeriana officinalis.\n",
                "Famille:  Valérianacées.\n",
                "Type:Fleur.",
                "Propriétés :\n"+
                        "La valériane est utilisée depuis des millénaires pour ses propriétés sédatives et relaxantes. Connaissant un succès grandissant depuis quelques décennies, elle est reconnue pour soulager la nervosité et l'anxiété et pour ses propriétés inductrices du sommeil.\n",
                "Parties utilisées: Les parties utilisées de la valériane sont les parties souterraines (rhizome, racine, stolon).\n",
                "Posologie :\n"+
                        "En Usage Interne:\n" +
                        "Contre les troubles neurovégétatifs, troubles légers du sommeil\n" +
                        "Infusion : laisser infuser 15 min. 1 cuill. à soupe de rhizome par tasse d’eau bouillante. Filtrer. 1 tasse en fin d’après-midi et/ou vers 20 h. \n" +
                        "ou \n" +
                        "Gélules de poudre : 2 par jour pendant le repas (troubles neurovégétatifs) ou 2 avant le dîner et 2 au coucher (troubles légers du sommeil). \n" +
                        "ou \n" +
                        "Gélules dosées à 50-100 mg d’extrait sec : 2 gélules 3 fois par jour. \n" +
                        "ou \n" +
                        "Extrait aqueux ou hydroalcoolique titré à moins de 30° d’alcool, suspension ou solution buvable : 1 à 2 fois par jour (troubles neurovégétatifs) et 1 fois au coucher (troubles légers du sommeil).\n" +
                        "En cas de persistance des symptômes, consultez un médecin.",
                " Précautions d'emploi :\n"+
                        "Sauf avis médical, la plante est proscrite en cas de prise de psychotropes, de même que pendant la grossesse ou lors de l’allaitement. Comme toute plante, elle peut s’avérer nocive en quantités inappropriées. Respectez toujours les doses indiquées. Ne pas donner en dessous de 6 ans sans avis médical.\n"

        );
        sqLiteHelper.insertData(
                "Verveine Odorante",
                "verveineordante",
                "Nom latin:  Aloysia triphylla (ou Lippia citriodora).\n",
                "Famille: Verbénacées.\n",
                "Type:Feuille.",
                "Propriétés :\n"+
                        "La verveine odorante est idéale en cas de digestion difficile. Grâce à sa forte teneur en mucilages (substances végétales calmant les irritations), elle apaise les douleurs gastriques diverses (ballonnements, flatulences, crampes d’estomac...) Cette plante est aussi reconnue pour ses bienfaits antistress et contre l’insomnie légère.\n",
                "Parties utilisées: Les feuilles.\n",
                "Posologie :\n"+
                        "EN Usage Interne:\n" +
                        "Contre la digestion difficile;\n" +
                        "Infusion : 1 sachet dose dans une tasse d’eau bouillante. Laisser infuser 5 min. Deux tasses par jour après les principaux repas.\n" +
                        "En cas de persistance des symptômes, consultez un médecin.\n",
                " Précautions d'emploi :\n"+
                        "L’utilisation de la verveine odorante n’aurait entraîné ni effet secondaire, ni toxicité à ce jour. Elle reste cependant contre-indiquée chez l’enfant de moins de 6 ans et chez la femme enceinte ou allaitante. Enfin, il ne faut pas confondre verveine odorante et verveine officinale. Elles appartiennent à la même famille botanique mais leur composition et leur emploi sont différents.\n"

        );



    }
}
